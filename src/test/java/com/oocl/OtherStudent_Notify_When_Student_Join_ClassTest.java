package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class OtherStudent_Notify_When_Student_Join_ClassTest {
    @Test
    public void should_otherstudent_nofity_when_student_join_the_class() {

        Klass klass = new Klass(2);
        Student tom = new Student();
        Student jim = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        jim.setName("Jim");
        klass.appendMember(tom);
        klass.appendMember(jim);
        assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.",tom.getWelcomeMessage());

    }
}