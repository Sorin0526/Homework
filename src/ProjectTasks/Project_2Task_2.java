package ProjectTasks;

public class Project_2Task_2 {

    public static void main(String[] args) {

        float quarters = 0.25f;
        float dimes = 0.10f;
        float nickels = 0.05f;
        float pennies = 0.01f;


        float qt = quarters * 5;
        float dt = dimes * 4;
        float nt = nickels * 3;
        float tp = pennies * 2;

        float total = qt+dt+nt+tp;

        System.out.println("The total in dollars is $" + total);



    }
}
