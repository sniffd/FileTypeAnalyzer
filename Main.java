package analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];
        String pattern = args[1];
        String format = args[2];
        File file = new File(fileName);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                if (sc.nextLine().contains(pattern)) {
                    System.out.println(format);
                    return;
                }
            }
            System.out.println("Unknown file type");
        } catch (FileNotFoundException e) {
            System.out.println("No file found " + fileName);
        }
    }
}
