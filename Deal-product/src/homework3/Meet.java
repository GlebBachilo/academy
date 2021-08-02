package homework3;

import java.util.Objects;

public class Meet extends Product {

    private String type;
    private double weight;

    public Meet() {
        super();
    }

    public Meet(String name, double price, int quantity, String type, double weight) {
        super(name, price, quantity);
        this.type = type;
        this.weight = weight;
    }

    @Override
    protected double discount() {
        if(weight<1.5){
            return 0.1;
        }
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Meet meet = (Meet) o;
        return Double.compare(meet.weight, weight) == 0 &&
                Objects.equals(type, meet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, weight);
    }
}
