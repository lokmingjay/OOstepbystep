package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teacher_Notify_When_Student_Join_ClassTest {
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