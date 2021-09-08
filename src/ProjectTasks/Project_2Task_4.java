package ProjectTasks;

public class Project_2Task_4 {

    public static void main(String[] args) {

        int initialNumber = 645876;
        int firstNumber = initialNumber % 10;
        initialNumber = initialNumber / 10;
        int secondNumber = initialNumber % 10 ;
        initialNumber = initialNumber / 10;
        int thirdNumber = initialNumber % 10;
        initialNumber = initialNumber / 10 ;
        int fourthNumber = initialNumber % 10;
        initialNumber = initialNumber / 10;
        int fifthNumber = initialNumber % 10;
        initialNumber = initialNumber / 10;
        int sixthNumber = initialNumber % 10;
        int product = firstNumber * secondNumber * thirdNumber * fourthNumber * fifthNumber * sixthNumber;
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber;

        System.out.println(product);
        System.out.println(sum);







    }
}