package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KlassTest {
    @Test
    public void should_join_class_only_once() {
        Klass klass = new Klass(2);
        Student student = new Student();
        student.setName("Tom");
        boolean check = klass.appendMember(student);
        System.out.println(check);

        klass.assignLeader(student);
        Assert.assertEquals(true,klass.isLeader(student));

    }

    @Test
    public void should_otherStudent_notify_when_leader_assigned() {

        Klass klass = new Klass(2);
        Student tom = new Student();
        Student jim = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        jim.setName("Jim");
        klass.appendMember(tom);
        klass.appendMember(jim);
        klass.assignLeader(jim);
        assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.",tom.getWelcomeMessage());
    }
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
    @Test
    public void should_notify_teacher_when_leader_assigned() {

        Klass klass = new Klass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        klass.assignTeacher(teacher);

        Student student = new Student();
        student.setName("Tom");
        klass.appendMember(student);
        klass.assignLeader(student);
        teacher.welcomeForLeader(student,klass);
        assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.",teacher.getWelcomeMessage());
    }
    @Test
    public void should_nofity_teacher_when_student_join_class() {

        Klass klass = new Klass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        klass.assignTeacher(teacher);

        Student student = new Student();
        student.setName("Tom");
        klass.appendMember(student);
        teacher.welcome(student,klass);
        assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.",teacher.getWelcomeMessage());

    }
}