package com.hackbulgaria.collectionsfun;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StudentSorterTestCase {
    List<Student> students;
    @Before
    public void setUp() throws Exception {
        students = Arrays.asList(new Student("ivo", 4), new Student("pin4o", 5), new Student("vo", 3), 
                new Student("az", 6), new Student("maina", 4), new Student("stoqn", 2));
        
        for(Student student: students){
            //System.out.println(student);
        }
    }

    @Test
    public void test() {
        students = StudentSorter.sortStudents(students);
        assertEquals(6, students.get(0).getGrade());
        assertEquals(5, students.get(1).getGrade());
        assertEquals(4, students.get(2).getGrade());
        assertEquals(4, students.get(3).getGrade());
        assertEquals(3, students.get(4).getGrade());
        assertEquals(2, students.get(5).getGrade());
        assertEquals("maina", students.get(2).getName());
    }

}
