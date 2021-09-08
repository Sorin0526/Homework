package Variables;

public class HomePractice {

    public static void main(String [] args){

        int audi=37;
        int chevy=16;
        int kia=23;
        int bmw=12;
        /*There are 4 brands of cars for sale at a dealership.
        2nd day 5 audi, 3 kia and 4 chevy are being sold.
        * find out how may cars are in the lot on day 1
          find out how many cars are left after day2 if 5 audi, 3 kia and 4 chevy are being sold.
          find out how many cars are left in the lot if from original lot only 7 bmw are being sold.
        * */

        int totalCars= (audi+chevy+kia+bmw);
        System.out.println(totalCars + " Cars at the dealership");

        int audiLeft= (audi-5);
        int chevyLeft=(chevy-4);
        int kiaLeft=(kia-3);
        int totalCarsLeft= (audiLeft+chevyLeft+kiaLeft+bmw);


        System.out.println(totalCarsLeft + " Cars left after day2 ");

        int bmwLeft= (bmw-7);
        int _totalCarsLeft= (audi+chevy+kia+bmwLeft);

        System.out.println("The number of cars on the lot if only 7 BMW were sold is " + _totalCarsLeft);










    }
}
