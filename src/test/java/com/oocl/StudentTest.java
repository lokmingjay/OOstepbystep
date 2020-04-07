package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void should_introduce_himself_student_expected() {
        Student student = new Student();
        student.setKclassNumber(2);
        student.setName("Tom");
        student.setAge(18);


        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL\n",student.introduce());
    }
}