package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teacher_Notify_When_Leader_AssignedTest {

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
}