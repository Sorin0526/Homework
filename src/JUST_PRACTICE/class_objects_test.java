package JUST_PRACTICE;

public class class_objects_test {

    public static void main(String[] args) {

        class_objects student= new class_objects();
        student.stats();
        student.name = "Sorin";
        student.eyeColor="brown";
        student.hairColor= "black";
        student.height= 5.10;
        student.weight= 150;

        student.stats();

        System.out.println(student.sum(2.5,7));
        double xyz = student.sum(7.6, 8.9);
        System.out.println(xyz);


        class_objects student1 = new class_objects();

        student1.stats();

        student.isLearning();
        student.isTired();
    }
}
