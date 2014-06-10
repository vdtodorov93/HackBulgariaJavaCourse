package com.hackbulgaria.collectionsfun;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class StudentSorter {
    private static void swap(int i, int j, Student[] students){
        Student tmp = students[i];
        students[i] = students[j];
        students[j] = tmp;
    }
    public static List<Student> sortStudents (List<Student> students){
        Student[] studentsSorted = new Student[students.size()];
        students.toArray(studentsSorted);
        for(int i = 0; i < studentsSorted.length - 1; i++){
            for(int j = i + 1; j < studentsSorted.length; j++){
                if(studentsSorted[i].getGrade() < studentsSorted[j].getGrade()){
                    swap(i, j, studentsSorted);
                }
                else if(studentsSorted[i].getGrade() == studentsSorted[j].getGrade()){
                    if(studentsSorted[i].getName().compareTo(studentsSorted[j].getName()) < 0){
                        swap(i, j, studentsSorted);
                    }
                }
            }
        }
        return Arrays.asList(studentsSorted);
    }
}
