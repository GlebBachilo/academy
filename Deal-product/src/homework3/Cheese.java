package homework3;

import java.util.Objects;

public class Cheese extends Product {

    private int age;


    public Cheese(){
        super();
    }

    public Cheese(String name, double price, int quantity, int age) {
        super(name, price, quantity);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected double discount() {
        if (age < 5) {
            return 0.15;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cheese cheese = (Cheese) o;
        return age == cheese.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }

}
