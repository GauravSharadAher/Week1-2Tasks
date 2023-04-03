



import java.util.Scanner;

public class Employeethis {
     int empId;
    float basicSal;
    String firstName , lastName;
    static int count =0;

    {
        count=count+1;
        empId=count;
    }

    public Employeethis() {

        System.out.println("\nEmployee's default constructor \nEmployee Id is : " + empId);

    }

    public Employeethis( String firstName, String lastName,float basicSal) {
      this.firstName=firstName;
      this.lastName=lastName;
      this.basicSal=basicSal;
   
    }

    public Employeethis(String firstName) {
     this.firstName=firstName;
    }




    public void  showData(){
        System.out.println("\n\nEmployee Id is: " + empId);
        System.out.println("First name of Employee is : " +firstName);
        System.out.println("last name of Employee is " +lastName);

        System.out.println("Employee salary is : " +basicSal);

    }

    



    public static void main(String[] args) {

       Employeethis e1 =new Employeethis();
       Employeethis e2=new Employeethis("Gaurav");
       Employeethis e3 =new Employeethis("Deepak","Shinde",20000);
       e2.showData();
       e3.showData();

    }

}
