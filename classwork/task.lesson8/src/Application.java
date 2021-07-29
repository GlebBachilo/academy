public class Application {
    public static void main(String[] args) {

        Printable[] printables = new Printable[3];

        printables[0] = new Book();
        printables[1] = new Magazine();
        printables[2] = new Book("metro2033");


        for (Printable p :printables) {
            p.print();
        }
        
    }
}
