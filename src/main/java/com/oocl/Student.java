package com.oocl;

import java.awt.event.KeyAdapter;

public class Student extends People {

    private int kclassNumber;
    private String welcomeMessage;
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public int getKclassNumber() {
        return kclassNumber;
    }

    public void setKclassNumber(int kclassNumber) {
        this.kclassNumber = kclassNumber;
    }

    @Override
    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a student of class " + kclassNumber + ". Coding for the glory of OOCL";
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void welcome(Student student) {
        welcomeMessage = introduce() + String.format(". Welcome %s join Class %s.", student.getName(), kclassNumber);
    }

    public void welcomeLeader(Student student) {
        welcomeMessage = introduce() + String.format(". %s is the leader of Class %s.", student.getName(), kclassNumber);
    }
}
