package DesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MedicalStudent extends  StudentBuilder {
    @Override
    StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>(List.of("Biology","Anatomy","Chemistry"));
        return this;
    }
}
