package challenges.hackerrank.intro;

import java.io.File;
import java.util.Scanner;

public class FilesHandler {
    public static void main(String[] args) {
        enfOfFile();

    }

    public static void enfOfFile() {
        try {
            File file = new File("G:\\My Drive\\programacion\\javaLearning\\SimpleChallenges\\data\\enfOfFile.txt");
            Scanner scan = new Scanner(file);
            int counter = 1;
            while (scan.hasNextLine()) {
                System.out.println(counter + " " + scan.nextLine());
                counter++;
            }

            scan.close();
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }


    }
}
