package com.company;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instantiate a Scanner object
        System.out.println("Hi, I'm Rock, the chatbot you programmed.");
        System.out.println("May I know your name?");

        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");

        System.out.println("I'm gonig to try to guess your age.");
        System.out.println("May I know the remainder of your age divided by 5?");

        int ageMod5 = scanner.nextInt();
        System.out.println("Thank you! May I know the remainder of your age divided by 7?");
        int ageMod7 = scanner.nextInt();
        System.out.println("Thank you! May I know the remainder of your age divided by 9?");
        int ageMod9 = scanner.nextInt();

        // deduce the age
        int age = 0;
        boolean found = false;
        while (age < 100) {
            if (age % 5 == ageMod5 && age % 7 == ageMod7 && age % 9 == ageMod9) {
                System.out.println(age);
                found = true;

            }
            age++;
        }
        if (!found) {
            System.out.println("Error: I couldn't Identify your age.");
        }
    }
}
