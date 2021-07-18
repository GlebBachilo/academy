package by.academy.homework.lesson1;

public class Cat {
    
    private int age;
    private String nickname;
    private double money;
    private char initials;
    private String isHomeAnimal;

    public Cat() {

    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public String getIsHomeAnimal() {
        return isHomeAnimal;
    }

    public void setIsHomeAnimal(String isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }


    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void grow() {
        age++;
        System.out.println("age = " + age);
    }

    public void sleep() {
        System.out.println("Cat-sleep...");
    }

    public void eat() {
        System.out.println("Cat-eat...");
    }

    public void walk() {
        System.out.println("Cat-walk");
    }

    void printAll() {
        System.out.println("name: " + nickname + " age: " + age + " initials: " + initials );
    }

}
