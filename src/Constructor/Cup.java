package Constructor;


public class Cup {

/*
-with the instance fields of: size, isClean, liquidAmount

-create a constructor to initialize all of these fields

-create a test class and create few objects to test your code
*/
    int size;
    boolean isClean;
    double liquidAmount;

    public Cup (int inputSize, boolean inputClean, double inputLiquidAmount) {
        this();// calling a constructor MUST be on the first line
        this.size = inputSize;// refers to the current class we are in
        this.isClean = inputClean;
        this.liquidAmount = inputLiquidAmount;
    }

        public Cup(int newSize, boolean newClean){
            this.size= newSize;
            this.isClean= newClean;
            System.out.println("This is two argument constructor");
        }

    public Cup (){
        this(33, true);
        System.out.println("This is NO argument constructor");

    }

//===============================================================
        public void info (){
            System.out.println("Size "+ size +" isClean:"+ isClean +" liquid amount is " + liquidAmount);
        }

        //toString method

        public String toString(){

            return "Size "+ size +" isClean:"+ isClean +" liquid amount is " + liquidAmount;
        }

 protected void finalize(){
     System.out.println("Now one object went to the garbage");
 }
}
