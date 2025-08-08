package DesignPatterns.lld.BuilderDesignPattern;

public class Client {

    public static void main(String[] args) {
        Director engDirect = new Director(new EngineeringStudent());
        Director medDirect = new Director(new MedicalStudent());

        Student student1 = engDirect.createStudent();
        Student student2 = medDirect.createStudent();

        System.out.println(student1.toString());
        System.out.println("***********************************");
        System.out.println(student2.toString());
    }
}
