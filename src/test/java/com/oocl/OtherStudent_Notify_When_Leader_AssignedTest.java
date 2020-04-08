package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class OtherStudent_Notify_When_Leader_AssignedTest {

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
}