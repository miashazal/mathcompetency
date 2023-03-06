package com.example.mathcompetency;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DSchoolList {
    // data section
    ArrayList<School> schools = new ArrayList<>();

    public void addSchool(School sc) {
        schools.add(sc);
    }

    public void display() {
        for (int i=0; i<schools.size(); i++) {
            System.out.print(schools.get(i));
        }
    }
    // test this class through a main method here
    public static void main(String args[]) {
        DSchoolList dl = new DSchoolList();

        School sc = new School();
        sc.setName("Firefield");
        dl.addSchool(sc);

        School sc2 = new School();
        sc2.setName("Greenwood");
        dl.addSchool(sc2);

        dl.display();
    }
}
