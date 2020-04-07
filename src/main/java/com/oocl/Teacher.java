package com.oocl;

public class Teacher extends People{
    private String welcomeMessage;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count =0;
    @Override
    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. Teaching for the future of world.";
    }
    public String getWelcomeMessage(){
        return welcomeMessage;
    }

    public void welcome(Student student, Klass klass){
        welcomeMessage = introduce() + String.format(" Welcome %s join Class %d.",student.getName(),klass.getNumber());
    }
}
