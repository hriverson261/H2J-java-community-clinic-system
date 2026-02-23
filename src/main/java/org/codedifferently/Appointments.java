package org.codedifferently;

import java.util.ArrayList;
import java.util.Scanner;

public class Appointments {

    private ArrayList<String> schedule = new ArrayList<>();
    private ArrayList<String> waitlist = new ArrayList<>();
    private final String gymName = "H2J GYM";

    // Example daily time slots
    private String[] timeSlots = {"9AM", "10AM", "11AM", "12PM", "1PM", "2PM", "3PM", "4PM", "5PM"};

    // Handle appointment menu
    public void handleAppointments(Scanner scanner) {
        System.out.print("Would you like to make an appointment at " + gymName + "? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("no")) {
            System.out.println("Ok, have a great day at " + gymName + "!");
            return;
        }

        boolean answer = true;
        while (answer) {
            System.out.println("\n--- " + gymName + " Appointment Menu ---");
            System.out.println("1. Book Appointment");
            System.out.println("2. Cancel Appointment");
            System.out.println("3. View Schedule");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int option = -1;
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    bookAppointment(scanner);
                    break;
                case 2:
                    cancelAppointment(scanner);
                    break;
                case 3:
                    viewSchedule();
                    break;
                case 4:
                    answer = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void bookAppointment(Scanner scanner) {
        System.out.print("Enter date (MM/DD): ");
        String date = scanner.nextLine();

        System.out.println("Available time slots at " + gymName + ":");
        for (String slot : timeSlots) {
            if (!schedule.contains(date + " " + slot)) {
                System.out.print(slot + " ");
            }
        }
        System.out.println();

        System.out.print("Enter time: ");
        String time = scanner.nextLine();
        String appointment = date + " " + time;

        if (schedule.contains(appointment)) {
            System.out.println("Time slot already booked at " + gymName + "! Adding to waitlist...");
            waitlist.add(appointment);
        } else {
            schedule.add(appointment);
            System.out.println("Appointment booked at " + gymName + " for " + appointment);
        }
    }

    private void cancelAppointment(Scanner scanner) {
        System.out.print("Enter date and time to cancel (MM/DD TIME): ");
        String appointment = scanner.nextLine();

        if (schedule.remove(appointment)) {
            System.out.println("Appointment canceled at " + gymName + ".");
            if (waitlist.contains(appointment)) {
                System.out.println("Moving " + appointment + " from waitlist to schedule.");
                schedule.add(appointment);
                waitlist.remove(appointment);
            }
        } else {
            System.out.println("Appointment not found at " + gymName + ".");
        }
    }

    private void viewSchedule() {
        System.out.println("\n--- Full Schedule at " + gymName + " ---");
        if (schedule.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (String slot : schedule) {
                System.out.println(slot);
            }
        }
        if (!waitlist.isEmpty()) {
            System.out.println("\n--- Waitlist ---");
            for (String slot : waitlist) {
                System.out.println(slot);
            }
        }
    }

    public ArrayList<String> getSchedule() {
        return schedule;
    }
}