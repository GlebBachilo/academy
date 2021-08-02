package homework3;

import java.util.Objects;

public class Cola extends Product {


    private String taste;


    public Cola() {
        super();
    }

    public Cola(String name, double price, int quantity, String taste) {
        super(name, price, quantity);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    @Override
    protected double discount() {
        if (quantity > 4) {
            return 0.2;
        }
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cola cola = (Cola) o;
        return Objects.equals(taste, cola.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taste);
    }
}
