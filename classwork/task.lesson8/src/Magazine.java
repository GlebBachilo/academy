import java.util.Objects;

public class Magazine implements Printable {


    private String type;

    public Magazine() {
        super();
    }

    public Magazine(String type) {
        super();
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void print() {

        System.out.println("this ia a magazine");
    }

    public static void printMagazine(Printable[]printables){
        for (Printable o:printables) {
            if (o instanceof Magazine){
                o.print();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(type, magazine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazine{");
        sb.append("type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
