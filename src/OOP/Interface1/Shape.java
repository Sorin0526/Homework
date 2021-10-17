package OOP.Interface1;

import org.omg.CORBA.PUBLIC_MEMBER;

public interface Shape {

    public final int SIDE = 5; // for variables no need to type public and final

    // Number is a class in Java (object type ) that can have co-variant


    Number area(int side); // for methods no need to use public and abstract


    Number perimeter(); //--> this is a method in interface, returns integer


    default void info(){

        System.out.println("I am info ab Shape Interface");

    }



    default void info(String nameOfShape){

        System.out.println("I am info ab Shape Interface "+"+ " + nameOfShape);

    }


//    private void info2(){
//        System.out.println(" ");
//    }



//  protected void info3(){} --> cannot use protected to create method







}
