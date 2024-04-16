package DesignPatterns.BuilderDesignPattern;

import java.util.List;

public class Student {

    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    Student(StudentBuilder builder){
        rollNumber = builder.rollNumber;
        age = builder.age;
        name = builder.name;
        fatherName = builder.fatherName;
        motherName = builder.motherName;
        subjects = builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
