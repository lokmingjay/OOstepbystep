package com.oocl;

public class Student extends People {
    @Override
    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. Coding for the glory of OOCL\n";
    }
}
