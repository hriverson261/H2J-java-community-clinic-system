package org.codedifferently;

public class GymSystem {

    private int memberCount = 0;
    private int guestCount = 0;
    private int completedAppointments = 0;
    private final String gymName = "H2J GYM";

    public void recordVisit(boolean isMember) {
        if (isMember) memberCount++;
        else guestCount++;
    }
    public void dailySummary() {
        System.out.println("\n-- Daily Summary for " + gymName + " --");
        System.out.println("Members visited: " + memberCount);
        System.out.println("Guests visited: " + guestCount);
        System.out.println("Appointments completed: " + completedAppointments);
    }

    public String getGymName() {
        return gymName;
    }
}


