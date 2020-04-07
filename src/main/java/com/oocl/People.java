package com.oocl;

public class People {
    private String name ;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old.\n";
    }
}
