package Task2;

import java.io.*;


public class Application {
    public static void main(String[] args) throws IOException {

        File fileWrite = new File("src\\Task2\\Task2text.txt");
        File fileRead = new File("src\\Task2\\Task2read.txt");

        if (!fileWrite.exists() && !fileRead.exists()) {

            fileWrite.createNewFile();
            fileRead.createNewFile();
        }
        try (FileInputStream inputStream = new FileInputStream(fileWrite);
             FileOutputStream outputStream = new FileOutputStream(fileRead)) {

            int b = inputStream.read();
            while (b != -1) {
                if (b != (int) ' ') {
                    outputStream.write(b);
                }
                b = inputStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
