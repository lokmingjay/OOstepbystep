package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    @Test
    public void should_introduce_himself_people_expected() {
        People people = new People();
        people.setName("Tom");
        people.setAge(21);
        Assert.assertEquals("My name is Tom. I am 21 years old.\n",people.introduce());
    }
}