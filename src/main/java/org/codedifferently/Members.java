package org.codedifferently;
import java.util.ArrayList;
import java.util.Scanner;


public class Members {

    private ArrayList<Member> memberList = new ArrayList<>(); // Array
    private final String gymName = "H2J GYM"; //Gym name declared and initialized

    //  declared values
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


}
