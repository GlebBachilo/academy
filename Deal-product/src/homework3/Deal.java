package homework3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Deal {

    private Product[] products;
    private LocalDate dealDate = LocalDate.now();
    private User seller;
    private User buyer;
    private static Scanner scan = new Scanner(System.in);
    private LocalDate deadlineDate;


    public Deal() {
        super();
    }

    public Deal(Product[] products, LocalDate dealDate, User seller, User buyer) {
        super();
        this.products = products;
        this.buyer = buyer;
        this.seller = seller;
        this.dealDate = dealDate;

    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public LocalDate getDeadDate() {
        return dealDate;
    }

    public void setDeadDate(LocalDate deadDate) {
        this.dealDate = deadDate;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public void printdeadlineDate() {
        setDeadlineDate(dealDate.plusDays(10));
        System.out.println(getDeadlineDate());
    }

    public void showYourBasket() {
        int i = 0;
        System.out.println("Your  products:");
        System.out.println("------------------------------");
        for (Product p : getProducts()) {
            System.out.println(i + ")" + p.getName() + " quantity: " +
                    p.quantity + " ProductPrice: " + p.counterPrice());
            i++;
        }
        System.out.println("------------------------------");
    }

    public void addProduct(Product product) {

        Product[] newBasket = new Product[products.length + 1];
        for (int k = 0; k < products.length; k++) {
            newBasket[k] = products[k];
        }
        newBasket[products.length] = product;
        products = newBasket;

    }

    public void deleteProduct() {
        showYourBasket();
        Product[] removeProd = new Product[products.length - 1];

        System.out.println("Введите номер продукта в списке который вы хотите удалить:");

        int productIndex = scan.nextInt();
        while (productIndex > products.length || productIndex < 0) {
            System.out.println("Введите существующий номер!");
            productIndex = scan.nextInt();
        }
        for (int i = 0, j = 0; j < products.length; j++) {
            if (products[j].equals(products[productIndex]) != true) {
                removeProd[i] = products[j];
                i++;
            }

        }
        products = removeProd;
    }

    public Product createProducts() {
        Product product = null;
        System.out.println(
                "select product type \n" + "1)Cola\n" + "2) Cheese\n" + "3) Meet\n" + "enter the number:");

        int productIndex = scan.nextInt();
        while (productIndex > 3 || productIndex < 1) {
            System.out.println("enter the existing number!");
            productIndex = scan.nextInt();
        }

        System.out.println(" set name:");
        String name = scan.nextLine();
        scan.nextLine();
        System.out.println("set price like as 130.2  :");
        double price = scan.nextDouble();
        System.out.println("set quantity:");
        int quantity = scan.nextInt();

        switch (productIndex) {
            case 1: {
                System.out.println("set taste:");
                String taste = scan.nextLine();
                product = new Cola(name, price, quantity, taste);
            }
            break;

            case 2: {
                System.out.println("set cheese age:");
                int age = scan.nextInt();
                product = new Cheese(name, price, quantity, age);
            }
            break;

            case 3: {
                System.out.println("set the type of meat");
                String type = scan.nextLine();
                scan.nextLine();
                System.out.println("set the weight of the meat ");
                double weight = scan.nextDouble();
                product = new Meet(name, price, quantity, type, weight);
            }
            break;
            default:
                System.out.println("enter the number correctly");
        }
        return product;
    }


    public double callFullPrice() {
        double callFullPrice = 0;
        if (products != null) {
            for (Product p : products) {
                callFullPrice += p.counterPrice();

            }
        }
        return callFullPrice;
    }

    public void deal() {
        System.out.println("Menu:\n" + "1)Enter buyer: \n" + "2)Enter seller\n" +
                "3)add product \n" + "4)delete product\n" + "5)to show your Basket\n" +
                "6)show deadline date\n" + "7)show Users info\n" + "8)show Bill\n"+"9)end the program");
        int choiceMenu;
        do {

            choiceMenu = scan.nextInt();
            switch (choiceMenu) {
                case 1:
                    inputUserInfo(buyer);
                    break;
                case 2:
                    inputUserInfo(seller);
                    break;
                case 3:
                    addProduct(createProducts());
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    showYourBasket();
                    break;
                case 6:
                    printdeadlineDate();
                    break;
                case 7:
                    System.out.println("Buyer: ");
                    buyer.usersInfo();
                    System.out.println("Seller: ");
                    seller.usersInfo();
                    break;
                case 8:
                    System.out.println(dealDate.getDayOfMonth() + "." + dealDate.getMonthValue() + "." + dealDate.getYear());
                    System.out.println("Bill:");
                    for (Product p : getProducts()) {
                        System.out.println(p.getName() + " price: " + p.counterPrice());
                    }

                    System.out.println("-------------------------");
                    System.out.println(callFullPrice());

                    break;
            }

        } while (choiceMenu != 9);
    }

    public void enterBirthDay() {
        System.out.println("set your birthday in the format\n" +
                "1) dd/MM/yyyy \n" + "2) dd-MM-yyyy");
        String birthday = scan.nextLine();
        Inputdata inputBirthDay = new Inputdata();
        getBuyer().setDayOfBirth(inputBirthDay.getLocalDate());
    }

    private void inputUserInfo(User user) {
        System.out.println("Enter your details :\n" + "Name:");
        user.setName(scan.nextLine());
        scan.nextLine();
        enterBirthDay();
        System.out.println("to enter a US number press 1\n" +
                "to enter a BEL number press 2");

        int yourChose = scan.nextInt();
        String fields;
        switch (yourChose) {
            case 1:
                System.out.println("Enter US number (+1-(210|214|254)-...-....):");
                AmericanPhoneValidator AmericanPhone = new AmericanPhoneValidator();
                do {
                    fields = scan.nextLine();
                } while (AmericanPhone.isValid(fields) == false);
                user.setPhone(fields);
                break;
            case 2:
                System.out.println("Enter US number (+375-(29|33|25)-...-....):");
                BelarusPhoneValidator BelarusPhone = new BelarusPhoneValidator();
                do {
                    fields = scan.nextLine();
                } while (BelarusPhone.isValid(fields) == false);
                user.setPhone(fields);
                break;
            default:
                System.out.println("re-enter");
        }

        System.out.println("Введите email:");
        EmailValidator validateEmail = new EmailValidator();
        do {
            fields = scan.nextLine();
            if (validateEmail.isValid(fields) == true) {
                user.setEmail(fields);
            }
        } while (user.getEmail() == null);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Objects.equals(dealDate, deal.dealDate) &&
                Objects.equals(seller, deal.seller) &&
                Objects.equals(buyer, deal.buyer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dealDate, seller, buyer);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("homework3.Deal{");
        sb.append("products=").append(Arrays.toString(products));
        sb.append(", deadDate=").append(dealDate);
        sb.append(", seller=").append(seller);
        sb.append(", buyer=").append(buyer);
        sb.append('}');
        return sb.toString();
    }


}//хз что лучше тк надо автоматический ввод значения можно методом можно
// инициализацией можно в конструкторе инициализировать

