package homework3;

public class Application {
    public static void main(String[] args) {

        Deal deal = new Deal();
        User seller = new User();
        User buyer = new User();

        Product products[] = new Product[3];


        products[0] = new Cheese("Gauda", 12.10, 1, 2);
        products[1] = new Cola("COCA-Cola", 1.99, 2, "original");
        products[2] = new Meet("Petruha", 5.60, 1,"chicken-thigh",1.8);


        deal.setBuyer(buyer);
        deal.setSeller(seller);

        deal.setProducts(products);

        deal.deal();


    }
}
