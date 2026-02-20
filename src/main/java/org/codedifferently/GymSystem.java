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
}