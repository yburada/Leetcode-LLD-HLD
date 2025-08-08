package DesignPatterns.lld.BuilderDesignPattern;

public class Director {
    StudentBuilder student;
    Director (StudentBuilder student){
        this.student = student;
    }

    public Student createStudent(){
        if(student instanceof EngineeringStudent)
            return createEngStudent();
        else if (student instanceof MedicalStudent)
            return createMedStudent();
        return null;
    }

    public Student createEngStudent(){
        return student.setRollNumber(123).setAge(23).setName("Harsh").setSubjects().build();
    }

    public Student createMedStudent(){
        return student.setRollNumber(143).setAge(23).setName("Hema nth").setFatherName("Kapali").setMotherName("Kashmora").setSubjects().build();
    }
}
