package ProjectTasks;

public class Project_2Task_5 {

    public static void main(String[] args) {

        int initialNumber = 12345;
        int firstNumber = initialNumber % 10;
        initialNumber = initialNumber / 10;
        int secondNumber = initialNumber % 10 ;
        initialNumber = initialNumber / 10;
        int thirdNumber = initialNumber % 10;
        initialNumber = initialNumber / 10 ;
        int fourthNumber = initialNumber % 10;
        initialNumber = initialNumber / 10;
        int fifthNumber = initialNumber % 10;


        System.out.println("" + firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber);

    }
}
