package Task2;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
                Reflection application = new Reflection();
                System.out.println("----------------------------------------");
                application.getMethod();
                System.out.println("----------------------------------------");
                application.getAllMethods();
                System.out.println("----------------------------------------");
                application.getField();
                System.out.println("----------------------------------------");
                application.getALLFields();
                System.out.println("----------------------------------------");
                application.getDeclaredMethod();
                System.out.println("----------------------------------------");
                application.getDeclaredField();
                System.out.println("----------------------------------------");
                application.getDeclaredMethods();
                System.out.println("----------------------------------------");
                application.getDeclaredFields();
                System.out.println("----------------------------------------");
                application.invokeToString();
                System.out.println("----------------------------------------");
                application.printUserClassField();
                System.out.println("----------------------------------------");
                application.printPersonClassField();
                System.out.println("----------------------------------------");

        }

}


