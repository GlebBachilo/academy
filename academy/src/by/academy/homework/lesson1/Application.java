package by.academy.homework.lesson1;

public class Application {
    public static void main(String[] args) {

        Cat catPervie = new Cat();
        Cat catVtoroi = new Cat("Snejok");

        catPervie.grow();
        catPervie.grow();
        catPervie.grow();

        catVtoroi.eat();
        catVtoroi.sleep();
        catVtoroi.walk();

        catVtoroi.setInitials('S');

        catPervie.printAll();
        catVtoroi.printAll();

    }
}
