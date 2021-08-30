package Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileCreator {
    public static final String stopСommand = "stop";

    public static void main(String[] args) throws IOException {

        File file = new File("src\\Task1\\Task1text.txt");

        Scanner scan = new Scanner(System.in);

        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fw = new FileWriter(file)) {
            String line = scan.nextLine();
            while (!line.equals(stopСommand)) {
                fw.write(line);
                fw.append('\n');
                line = scan.nextLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
