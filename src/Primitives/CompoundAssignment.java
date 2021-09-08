package Primitives;

public class CompoundAssignment {

    public static void main(String[] args) {

        int carNumber = 7;

        carNumber = carNumber + 5;
        System.out.println(carNumber); // 12 cars

        carNumber += 5;
        System.out.println(carNumber); // 17 cars
        carNumber /= 2; // carNumber = carNumber / 2;
        System.out.println(carNumber); // 8 cars because we used data type int

        int count = carNumber *2;

        System.out.println(count); // 16
        int count1;
       // count1 += 10; it is compile time error bc count1 does not have a value

        count -= carNumber; // count = count - carNumber; 16 - 8 = 8
        System.out.println(count);

        int payment = 50;
        payment *= carNumber; // payment = payment * carNumber;
        System.out.println(payment);

        int modulus = 1000;
        modulus %= payment; // first java divides 1000 by 400 and finds the remainder,
                            // and then it assigns the value for modulus variable.
        System.out.println(modulus);





    }
}
