/*
   Name: Nicholas Vickery
   Date: 11/08/2023
   CPT 236 - Java Programming
   Final Project

   *** The starting point for the Final Project ***
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // *************************************************************
        // This code is made available to students as a 'starting file'
        //  *** DO NOT MODIFY THIS CODE! ***

        // Create people (instructors and students)
        MyInstructor gFiori = new MyInstructor("George Fiori", 1999, 62250);
        MyStudent pJones = new MyStudent("Paul Jones", 2017, 3.0);
        MyStudent rReeves = new MyStudent("Robert Reeves", 2019, 2.8);
        MyStudent mAllen = new MyStudent("Meg Allen", 2018, 3.7);
        MyStudent wLevi = new MyStudent("William Levi", 2017, 2.5);
        MyStudent aSmith = new MyStudent("Ann Smith", 2016, 2.9);
        MyInstructor pSmith = new MyInstructor("Phil Smith", 2000, 64750);
        MyStudent bKennedy = new MyStudent("Bob Kennedy", 2018, 1.8);
        MyStudent jGilbert = new MyStudent("Jerry Gilbert", 2019, 3.2);
        MyStudent zBooth = new MyStudent("Zach Booth", 2017, 2.5);
        MyStudent sSavoca = new MyStudent("Sam Savoca", 2019, 2.6);
        MyStudent jEvans = new MyStudent("Julie Evans", 2019, 2.2);
        MyInstructor bCarson = new MyInstructor();
        MyStudent nMcMillian = new MyStudent("Nancy McMillian", 2018, 3.4);
        MyStudent cPhilo = new MyStudent("Cameron Philo", 2019, 2.7);
        MyStudent jQueen = new MyStudent("Jeanne Queen", 2017, 1.8);
        MyStudent dCiao = new MyStudent("Daniel Ciao", 2019, 3.9);
        MyStudent fDeLeo = new MyStudent("Frank DeLeo", 2018, 3.3);

        // Create courses
        MyCourse CPT234 = new MyCourse("CPT 234", "-001", gFiori);
        MyCourse IST222 = new MyCourse("IST 222", "-003", pSmith);

        // *****************************************************************

        // Code below here to be written by students

        // Enter Billy Carson's data (using setters for
        //  first name, last name, hire year, and base salary)
        bCarson.setFullName("Billy Carson");
        bCarson.setHiredYear(2017);
        bCarson.setBaseSalary(50000);
        // Update Julie Evans to Julie Randall (she got married)
        jEvans.setLastName("Randall");
        // Add the first 10 students to CPT 234 (in the order listed above)
        // starting with Paul Jones and ending with Julie (Evans) Randall
        CPT234.addStudent(mAllen);
        CPT234.addStudent(zBooth);
        CPT234.addStudent(jGilbert);
        CPT234.addStudent(pJones);
        CPT234.addStudent(bKennedy);
        CPT234.addStudent(wLevi);
        CPT234.addStudent(jEvans);
        CPT234.addStudent(rReeves);
        CPT234.addStudent(sSavoca);
        CPT234.addStudent(aSmith);
        // Add the last 10 student to IST 222 (in the order listed above)
        // starting with Bob Kennedy and ending with Frank DeLeo
        IST222.addStudent(zBooth);
        IST222.addStudent(dCiao);
        IST222.addStudent(fDeLeo);
        IST222.addStudent(jGilbert);
        IST222.addStudent(bKennedy);
        IST222.addStudent(nMcMillian);
        IST222.addStudent(cPhilo);
        IST222.addStudent(jQueen);
        IST222.addStudent(jEvans);
        IST222.addStudent(sSavoca);
        // Display the CPT 234 info
        CPT234.printAll();
        CPT234.printCourseList();
        // Display the IST 222 info
        IST222.printAll();
        IST222.printCourseList();
        // Display Billy Carson's info
        System.out.println("The other CIT instructor is " + bCarson.getFullName() + " - " + bCarson.getIDNumber());
        System.out.println("who was hired in " + bCarson.getHiredYear() + ".");
        System.out.println();
        // Display CPT 234 student with the earliest start year
        CPT234.printMinYear();
        // Display IST 222 student with highest GPA
        IST222.printMaxGPA();

        scnr.close();
        // *** TestBench code ***
        TestBench test = new TestBench();
        test.testProject();
    }
}