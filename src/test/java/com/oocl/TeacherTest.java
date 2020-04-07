package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void should_introduce_himself_teacher_expected() {
        Teacher teacher = new Teacher();
        teacher.setName("Tom");
        teacher.setAge(18);
        Assert.assertEquals("My name is Tom. I am 18 years old. Teaching for the future of world.\n",teacher.introduce());

    }
}