package DesignPatterns.lld.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudent extends  StudentBuilder{
    @Override
    StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>(List.of("DSA","CS","Algo"));
        return this;
    }
}
