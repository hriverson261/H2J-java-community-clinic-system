package org.codedifferently;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Members members = new Members();
        Appointments appointments = new Appointments();
        GymSystem gym = new GymSystem();

        System.out.println("Welcome to " + gym.getGymName() + "!");

        boolean isMember = members.checkMembership(scanner);
        gym.recordVisit(isMember);

        boolean running = true;
        while (running) {
            System.out.println("\n--- " + gym.getGymName() + " Main Menu ---");
            System.out.println("1. Manage Appointments");
            System.out.println("2. Search Member");
            System.out.println("3. Complete Appointment");
            System.out.println("4. Daily Summary");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    appointments.handleAppointments(scanner);
                    break;
                case 2:
                    members.searchMember(scanner);
                    break;
                case 3:
                    gym.appointmentCompleted();
                    System.out.println("Appointment marked as completed at " + gym.getGymName() + ".");
                    break;
                case 4:
                    gym.dailySummary();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        System.out.println("Thank you for visiting " + gym.getGymName() + "! Goodbye!");
        scanner.close();
    }
}
