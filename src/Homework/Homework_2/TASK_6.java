package Homework.Homework_2;

public class TASK_6 {

    public static void main(String[] args) {

        double bobSalary = 200_000;
        // 5% for 200_000 * .5     8% for 200_000 * .3      10% for 200_000 * .2
        double bonus = (bobSalary / 2 ) * .05;
        double bonus1 = (bobSalary * .3) * .08;
        double bonus3 = (bobSalary * .1) * .2;
        double totalBonus = (bonus +bonus1+bonus3);
        System.out.println(totalBonus);

    }
}
