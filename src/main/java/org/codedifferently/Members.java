package org.codedifferently;
import java.util.ArrayList;
import java.util.Scanner;


public class Members {

    private ArrayList<Member> memberList = new ArrayList<>();
    private final String gymName = "H2J GYM";

    // declared variables
    static class Member {
        String name;
        int age;
        String gender;
        String email;

        Member(String name, int age, String gender, String email) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.email = email;
        }
    }

    //Ask user if they are a member
    public boolean checkMembership(Scanner scanner) {

        System.out.print("Are you a member of " + gymName + "? (yes/no): ");
        String answer = scanner.nextLine();

        // keep asking while input is not yes or no
        while (!answer.equalsIgnoreCase("yes") &&
                !answer.equalsIgnoreCase("no")) {

            System.out.print("Invalid input. Please enter yes or no: ");
            answer = scanner.nextLine();
        }

        // process valid answer
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Have a great workout at " + gymName + "!");
            return true;
        } else {
            registerMember(scanner);
            return false;
        }
    }

    // Register new member
    public void registerMember(Scanner scanner) {
        System.out.println("Welcome to " + gymName + "! Please register:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = -1;

        while (age < 16) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age < 16) {
                    System.out.print("You must be at least 16 years old. Enter a valid age: ");
                }
            } else {
                System.out.print("Invalid input. Enter a number for age: ");
                scanner.next();
            }
        }
        scanner.nextLine(); //created scanner for user input

        System.out.print("Enter your gender (male/female): ");
        String gender = scanner.nextLine();

        while (!gender.equalsIgnoreCase("male") &&
                !gender.equalsIgnoreCase("female")) {

            System.out.print("Invalid input. Please enter 'male' or 'female': ");
            gender = scanner.nextLine();
        }
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        memberList.add(new Member(name, age, gender, email));
        System.out.println("Thank you for registering, " + name + "! Enjoy your visit to " + gymName + "!");
    }

    // Search for members by name
    public void searchMember(Scanner scanner) {
        System.out.print("Enter member name to search in " + gymName + ": ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Member m : memberList) {
            if (m.name.equalsIgnoreCase(name)) {
                System.out.println("Member Found: " + m.name + ", Age: " + m.age + ", Gender: " + m.gender + ", Email: " + m.email);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found in " + gymName + ".");
        }
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }
}
