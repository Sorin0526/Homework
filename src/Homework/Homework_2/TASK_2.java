package Homework.Homework_2;

public class TASK_2 {

    public static void main(String[] args) {

        int result = 4 * 7 + 3 - 2 * 9 % 5 / 3 - 2;
        /*
 int result = 4 * 7 + 3 - 2 * 9 % 5 / 3 - 2;

 1. 4 * 7 = 28
 	28 + 3 - 2 * 9 % 5 / 3 - 2

 2. 2 * 9 = 18
 	28 + 3 - 18 % 5 / 3 - 2

 3. 18 % 5 = 3
 	28 + 3 - 3 / 3 -2

 4. 3 / 3 = 1
 	28 + 3 - 1 - 2

 5. solve from left to right
 	28 + 3 - 1 - 2 = 28
 */
//===================================================================================

        int result1 = 12 - 3 / 3 + 4 - 2 * 2 % 4 + 12 % 3 / 3;
       /*
        int result1 = 12 - 3 / 3 + 4 - 2 * 2 % 4 + 12 % 3 / 3;

        1. 3 / 3 = 1
        12 - 1 + 4 - 2 * 2 % 4 + 12 % 3 / 3

        2. 2 * 2 = 4
        12 - 1 + 4 - 4 % 4 + 12 % 3 / 3

        3. 4 % 4 = 0
        12 - 1 + 4 - 0 + 12 % 3 / 3

        4. 12 % 3 = 0
        12 - 1 + 4 - 0 + 0 / 3

        5. 0 / 3 = 0
        12 - 1 + 4 - 0 + 0

        6. solve from left to right
        12 - 1 + 4 - 0 + 0 = 15   */

        System.out.println(result);
        System.out.println(result1);

    }
}
