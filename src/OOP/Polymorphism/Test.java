package OOP.Polymorphism;

public class Test {

    public static void main(String[] args) {

        ATM atm= new ATM();
        atm.balance();

        //Branch branch = (Branch)atm;//ClassCastException: OOP.Polymorphism.ATM cannot be cast to OOP.Polymorphism
       // branch.loan();

        ATM branch1 = new Branch();//left side decides where the methods are coming from
                                    //right side is what type of object  and where you have created

        branch1.deposit();
       // branch1.loan();       //symbol:   method loan()
                                //location: variable branch1 of type OOP.Polymorphism.ATM

        Branch branch2 = new Branch();
        branch2.hire();
        branch2.loan();

        Bank bank = new Bank();
        bank.withDraw();

        ATM atm1 = new Bank();
        atm1.balance();


// DOWN CASTING THE OBJECT TO THE CHILD REFERENCE

        ((Branch)atm1).hire();

        ((Bank) atm1).hire();

        ATM atm2 = new Branch();
        ((Branch) atm2).hire();

       // ((Bank)atm2).hire();

        Bank bank1 = new Bank();
//one object using methods from three dif classes
        bank1.withDraw();
        bank1.hire();
        bank1.assistance();


    }
}
