package DesignPatterns.BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

    /*
    When we will use Builder Design pattern
    When the every field is not mandatory. So for creating all args constructor and overloading constructors. We can use Builder Design pattern
     */

    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
