package org.codedifferently;

import java.util.ArrayList;
import java.util.Scanner;

public class Appointments {
    //Creating an array list for scheduling and waitlist
    private ArrayList<String> schedule = new ArrayList<>();
    private ArrayList<String> waitlist = new ArrayList<>();
    private String gymName = "H2J Gym";

    //Daily Time Slots
    private String[] timeSlots = {"9AM", "10AM", "11AM", "12PM", "1PM", "2PM", "3PM", "4PM", "5PM"};

    public void appointmentHandling(Scanner scanner) {
        System.out.print("Would you like to make an appointment at " + gymName + "? (yes/no): ");
        String answer = scanner.nextLine();

        if (answer.equals("no")) {
            System.out.println("Ok, have a great day at " + gymName + "!");
            return;
        }










}
