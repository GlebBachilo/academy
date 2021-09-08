package Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    Class<? extends Person> peClass = Person.class;
    Class<? extends User> usClass = User.class;

    User user = new User("Gleb", "Bachilo", 20, "2001/ 20/ 10", "alalal", "123456",
            "Gleb@mail.com");

    Person person = new Person("Nikita", "Semchenkov", 20,
            "2001/ 20/ 10");

    Field[] fields;
    Method[] methods;

    public void getAllMethods() {
        System.out.println("person methods==================");
        methods = peClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("user methods==================");
        methods = usClass.getMethods();
        for (Method method1 : methods) {
            System.out.println(method1);
        }
    }

    public void getMethod() {
        try {
            System.out.println(peClass.getMethod("getFirstName"));
            System.out.println(usClass.getMethod("getDateOfBirth"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void getALLFields() {
        fields = peClass.getFields();
        System.out.println("user fields:");
        for (Field pf : fields) {
            System.out.println(pf.getName());
        }
        fields = usClass.getFields();
        System.out.println("person fields:");
        for (Field uf : fields) {
            System.out.println(uf.getName());
        }
    }

    public void getField() {
        try {
            System.out.println(usClass.getField("login"));
            System.out.println(peClass.getField("firstName"));
        } catch (NoSuchFieldException e) {
            e.getStackTrace();
        }
    }

    public void getDeclaredMethod() {
        try {
            System.out.println(usClass.getDeclaredMethod("getEmail"));
            System.out.println(peClass.getDeclaredMethod("getAge"));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void getDeclaredField() {
        try {
            System.out.println(peClass.getDeclaredField("dateOfBirth"));
            System.out.println(usClass.getDeclaredField("password"));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void getDeclaredMethods() {
        System.out.println("person Declared methods ========================");
        methods = peClass.getDeclaredMethods();
        for (Method mp : methods) {
            System.out.println(mp);
        }
        System.out.println("user Declared methods ========================");
        methods = usClass.getDeclaredMethods();
        for (Method mu : methods) {
            System.out.println(mu);
        }
    }

    public void getDeclaredFields() {
        System.out.println("person Declared fields ========================");
        fields = peClass.getDeclaredFields();
        for (Field pf : fields) {
            System.out.println(pf);
        }
        System.out.println("user Declared fields ==========================");
        fields = usClass.getDeclaredFields();
        for (Field uf : fields) {
            System.out.println(uf);
        }
    }

    private void accessible(Class<?> clz, Object o, String personName, String newName) {
        try {
            Field field = clz.getDeclaredField(personName);
            field.setAccessible(true);
            field.set(o, newName);
            System.out.println(field.get(o));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void printPersonClassField() {
        accessible(peClass, person, "lastName", "Soloviev");
    }

    public void printUserClassField() {
        accessible(usClass, user, "login", "Sovoiev@bk.ru");
    }

    public void invokeToString() {
        Person person1 = new Person();
        try {
            Method personToString = peClass.getDeclaredMethod("toString");
            personToString.invoke(user);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
