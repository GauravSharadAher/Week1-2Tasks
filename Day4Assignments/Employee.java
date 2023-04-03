


import java.util.Scanner;

public class Employee {
     int empId;
    float basicSal;
    String firstName , lastName;
    static int count =0;

    {
        count=count+1;
        empId=count;
    }

    public Employee() {

        System.out.println("\nEmployee's default constructor \nEmployee Id is : " + empId);

    }

    public Employee( String firstName, String lastName,float basicSal) {
        System.out.println("\n\nThis is Parameterized Constructor with 4 parameters");
        System.out.println("Employee Id is: " + empId);

        System.out.println("First name of Employee is : " +firstName);

        System.out.println("last name of Employee is " +lastName);

        System.out.println("Employee salary is : " +basicSal);
    }

    public Employee(String firstName) {
        System.out.println("\n\nThis is Parameterized Constructor with 2 parameters");
        System.out.println("Employee Id is: " + empId);

        System.out.println("First name of Employee is : " +firstName);
    }



    public void  acceptData(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        empId =in.nextInt();
        System.out.println("Enter First name of Employee");
        firstName=in.next();
        System.out.println("Enter last name of Employee");
        lastName=in.next();
        System.out.println("Enter Employee salary : ");
        basicSal=in.nextInt();
    }
    public void  showData(){
        System.out.println("\n\nEmployee Id is: " + empId);
        System.out.println("First name of Employee is : " +firstName);
        System.out.println("last name of Employee is " +lastName);

        System.out.println("Employee salary is : " +basicSal);

    }

    



    public static void main(String[] args) {

       Employee e1 =new Employee();
        Employee e2=new Employee("Gaurav");
        Employee e3 =new Employee("Deepak","Shinde",20000);
        

    }

}