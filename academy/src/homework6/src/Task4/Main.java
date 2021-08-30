package Task4;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Random;

public class Main {
    public static Random rand = new Random();

    public static void main(String[] args) {

        String text;

        File directory = new File("src\\Task4\\ioTask4");
        if (!directory.exists()) {
            directory.mkdir();
        }

        File file;
        for (int j = 0; j < 100; j++) {
            file = new File("src\\Task4\\ioTask4\\" + (j + 1) + ".txt");

            try {
                if (!file.exists()) {
                    file.createNewFile();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            file = new File("src\\Task2\\Task2Text.txt");
            if (!file.exists()) {
                System.err.println("нету такого файла");
                return;
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                text = bufferedReader.readLine();
                for (int i = 1; i <= 100; i++) {
                    file = new File("src\\Task4\\ioTask4\\" + i + ".txt");
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(text.substring(0, rand.nextInt(text.length())));
                    fileWriter.close();
                }
                file = new File("src\\Task4\\ioTask4\\Result.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter writer = new FileWriter(file);
                File[] randFiles = directory.listFiles();
                for (File files : randFiles) {
                    writer.write("file name" + files.getName() + "file length" + files.length() + "\r\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
