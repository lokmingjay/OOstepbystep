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
        student.setKclassNumber(2);
        boolean check = klass.appendMember(student);
        System.out.println(check);

        klass.assignLeader(student);
        Assert.assertEquals(true,klass.isLeader(student));

    }
}