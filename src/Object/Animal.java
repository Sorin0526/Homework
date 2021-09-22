package Object;

public class Animal {

    String name= "Jerry";
    int age;
    double weight;
    int legNumber;
    double energy= 100;


//  access modifier,   return type,   name of method
       public            void               run (String destination){
                                // in () -you can pass parameters

           energy-=10;

        System.out.println(name+ " is running "+ destination);

    }

    // create a sleep method and print " .. is sleepin"
    // make every animal sleep

    public void sleep(){
           energy = 100;

        System.out.println(name + " is sleeping");
    }
    // create  "printInfo() method to print out all information
    //about the animal

    public void printInfo(){

        System.out.println("Name is "+name+" Age is "+age+" Weight is "+weight+" Leg number "+legNumber+" Energu is "+ energy);
    }

}
