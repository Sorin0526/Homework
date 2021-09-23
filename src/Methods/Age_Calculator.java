package Methods;

public class Age_Calculator {

    //create a method that will take one integer parameter for your birth year
    // this method simply calculates and print your age

    public void ageCalculator(int birthYear){

        int age = 2021- birthYear;

        System.out.println(" your age is "+ age);
    }


    public int ageCalculator(){



        int age = 2021- 2015;

        System.out.println(" your age is "+ age);
        return age;


    }

    // overload this method by passing a string parameter
    // which is going to be the name of the person
    // and print out the age of the person as :
    //"...your age is ..."

    public String ageCalculator(int birthYear, String name ){

        int age = 2021- birthYear;

       // System.out.println(name+ " your age is "+ age);

        return " "+name +" your age is "+ age;
    }











    public static void main(String[] args) {

    Age_Calculator tom= new Age_Calculator();
    tom.ageCalculator(2013);
    }
}
