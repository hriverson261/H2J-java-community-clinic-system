package org.codedifferently;

import java.util.ArrayList;
import java.util.Scanner;

public class Appointments {
    //Creating an array list for scheduling and waitlist
    private ArrayList<String> schedule = new ArrayList<>();
    private ArrayList<String> waitlist = new ArrayList<>();
    private String gymName = "H2J Gym";


    public Appointments(){
        gymName = this.gymName;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String name){
        this.gymName = gymName;
    }

    //Daily Time Slots
    private String[] timeSlots = {"9AM", "10AM", "11AM", "12PM", "1PM", "2PM", "3PM", "4PM", "5PM"};

    public void appointmentHandling(String answer) {
        if (answer.equals("no")) {
            System.out.println("Ok, have a great day at " + gymName + "!");
            return;
        }

       Scanner scan = new Scanner(System.in);

        boolean choice = true;
        while (choice) {
            int num = 0;
            System.out.println("\n--- " + gymName + " Appointment Menu ---");
            System.out.println("Please enter a number to select an option: \n1: Book Appintment" +
                    "\n2. Cancel Appointment \n3. View Schedule\n4. Exit");
            num = scan.nextInt();


            switch(num){
                case 1:
                    System.out.println("Booking Appointment...");
                    break;
                case 2:
                    System.out.println("Cancelling Appointment...");
                    break;
                case 3:
                    System.out.println("Viewing Schedule...");
                    break;
                case 4:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid choice please try again");

            }
        }
        }











}
