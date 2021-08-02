package homework3;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private String name;
    private double money;
    private LocalDate dayOfBirth;
    private String email;
    private String phone;

    public User() {
        super();
    }

    public User(String name, double money, String email, String phone) {
        super();
        this.name = name;
        this.money = money;
        this.email = email;
        this.phone = phone;
        this.dayOfBirth = dayOfBirth;
    }


    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void usersInfo() {

        System.out.println("------------------------------");
        System.out.println("User information");
        System.out.println("------------------------------");
        System.out.println("User name :" + getName());
        System.out.println("User phone :" + getPhone());
        System.out.println("User Email :" + getEmail());
        System.out.println("User Birthday:" + getDayOfBirth().getDayOfMonth() + "/"
                + getDayOfBirth().getMonth() + "/" + getDayOfBirth().getYear());
        System.out.println("------------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.money, money) == 0 &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("homework3.User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }

/////////////хз делать проверку на null
}

