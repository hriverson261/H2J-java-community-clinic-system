package org.codedifferently;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Appointments appoint = new Appointments();

            appoint.setGymName("H2J");
            String gymName = appoint.getGymName();

            System.out.print("Would you like to make an appointment at " + gymName + "? (yes/no): ");
            String answer = scanner.nextLine();
            appoint.appointmentHandling(answer);

        }
    }