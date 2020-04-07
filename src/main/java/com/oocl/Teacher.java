package com.oocl;

public class Teacher extends People{
    @Override
    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. Teaching for the future of world.\n";
    }
}
