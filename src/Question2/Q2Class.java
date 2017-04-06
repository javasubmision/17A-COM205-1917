/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rasheedarh
 */
public class Q2Class {
    static String name, Gender, DOB, Faculty, Department, University;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Q2Class.name = name;
    }

    public static String getGender() {
        return Gender;
    }

    public static void setGender(String Gender) {
        Q2Class.Gender = Gender;
    }

    public static String getDepartment() {
        return Department;
    }

    public static void setDepartment(String Department) {
        Q2Class.Department = Department;
    }

    public static String getDOB() {
        return DOB;
    }

    public static void setDOB(String DOB) {
        Q2Class.DOB = DOB;
    }

    public static String getFaculty() {
        return Faculty;
    }

    public static void setFaculty(String Faculty) {
        Q2Class.Faculty = Faculty;
    }

    public static String getUniversity() {
        return University;
    }

    public static void setUniversity(String University) {
        Q2Class.University = University;
    }
    public static void writeFile() throws IOException
    { 
       try(BufferedWriter stud= new BufferedWriter(new FileWriter("Staff.txt",true))){ 
      stud.write(getName()+" "+getGender()+" "+getDOB()+" "+getFaculty()+" "+getDepartment()+" "+getUniversity());
       stud.newLine();
       }
    }
}
