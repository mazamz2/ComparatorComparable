package com.blit.day10;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableIntro {

//    Comparable:
//    Comparable is interface of java.lang
//    It is used to compare current object with another object
//    single sorting using compareTo() method

//    Comparator:
//    Comparator is a interface of java.util
//    It is used to compare two or more objects
//    multiple sorting using compare() method

    public static void main(String[] args) {

        ArrayList<Students> s = new ArrayList<>();
        s.add(new Students(12, "alice"));
        s.add(new Students(42, "david"));
        s.add(new Students(10, "bob"));
        s.add(new Students(35, "ron"));
        s.add(new Students(5, "alicia"));

        /*
        Comparable Example

        Collections.sort(s);
        // following method can achieve the same thing
        //s.sort(StudentExample::compareTo);
        */

        /*
        Comparator Example
         */
        // following both syntax works to sort
        //Collections.sort(s, new IdComparator());
        s.sort(new IdComparator());
        System.out.println(s);

        for(Students student: s){
            System.out.println(student.getId()+" "+student.getName());
        }
    }
}
