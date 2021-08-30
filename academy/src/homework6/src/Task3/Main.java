package Task3;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userArrayList = new ArrayList<>();

        userArrayList.add(new User("Artem", "Soloviev", 23));
        userArrayList.add(new User("Nikita", "Semchenkov", 25));
        userArrayList.add(new User("Gleb", "Zhiznevski", 20));
        userArrayList.add(new User("Pasha", "Sidorovicj", 19));

        userArrayList.add(new User("Andrei", "Soloviev", 20));
        userArrayList.add(new User("Dima", "krivezh", 21));
        userArrayList.add(new User("Artur", "Dergachov", 27));
        userArrayList.add(new User("Vania", "Abramovich", 17));

        userArrayList.add(new User("Maks", "Shilo", 26));
        userArrayList.add(new User("Makar", "Zagvozdin", 22));

        File userDir = new File("src\\Task3\\io");
        if (!userDir.exists()) {
            userDir.mkdir();
        }
        for (User u : userArrayList) {
            File userFile = new File("src\\Task3\\io\\" + u.getSurname() + "-" + u.getName() + ".txt");
            try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(userFile))) {
                if (!userFile.exists()) {
                    userFile.createNewFile();
                }
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(u);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
