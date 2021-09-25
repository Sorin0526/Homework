package Constructor;

public class Employee_Test {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name= "Zack";
        employee1.age= 25;

        employee1.setEmployeeId(11);
        System.out.println(employee1.employeeId);// initialized with the help of method

        Employee employee2= new Employee("female");
        System.out.println(employee2.gender);
        employee1.info();
        employee2.info();





    }

}
