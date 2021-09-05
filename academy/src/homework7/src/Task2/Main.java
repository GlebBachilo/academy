package Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bachilo", "Gleb", 20, "2001/ 20/ 10", "alalal", "123456",
                "Gleb@mail.com");

        Person person = new Person("Bachilo", "Gleb", 20,
                "2001/ 20/ 10");

        Class<? extends User> usClass = user.getClass();
        Class<? extends Person> peClass = person.getClass();

       //в процессе
    }

}

