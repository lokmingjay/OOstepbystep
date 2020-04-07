package com.oocl;

public class Student extends People {

    private int kclassNumber;

    public int getKclassNumber() {
        return kclassNumber;
    }

    public void setKclassNumber(int kclassNumber) {
        this.kclassNumber = kclassNumber;
    }

    @Override
    public String introduce() {
        return "My name is "+getName()+". I am "+ getAge() +" years old. I am a student of class " + kclassNumber+ ". Coding for the glory of OOCL\n";

    }
}
