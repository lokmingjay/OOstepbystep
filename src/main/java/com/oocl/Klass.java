package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private List<Student> students;
    private Teacher teacher;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        students = new ArrayList<Student>();
    }

    public int getNumber(Student student) {
        return number;
    }

    public void leaveKlass(Student student) {
        if (students.contains(student)) {
            students.remove(student);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean appendMember(Student student) {
        if (student.getKclassNumber() != number && !students.contains(student)) {
            for (Student otherStudent : students) {
                otherStudent.welcome(student);
            }
            if (student.getKclassNumber() != 0) {
                student.getKlass().leaveKlass(student);
            }
            student.setKlass(this);
            this.students.add(student);
            student.setKclassNumber(number);
            return true;
        }
        return false;
    }

    public void assignLeader(Student student) {
        if (student.getKclassNumber() == this.number && students.contains(student)) {
            this.leader = student;
            for (Student otherStudent : students) {
                if (otherStudent != student) {
                    otherStudent.welcomeLeader(student);
                }
            }
        }
    }

    public boolean isTeacherOfTheClass(Teacher teacher) {
        return teacher == this.teacher;
    }

    public boolean isLeader(Student student) {
        return leader == student;
    }

    public void assignTeacher(Teacher teacher) {
        if (teacher.getCount() >= 5) {
            System.out.println("The teacher already have 5 classes\n");
            return;
        }
        int count = teacher.getCount();
        this.teacher = teacher;
        teacher.setCount(count + 1);
    }
}
