

import java.util.Scanner;

public class Student {

    int i, j , k ;
    String name;

    double percentage;


    public void  getData(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter student name: ");
        name =in.nextLine();
        System.out.println("Enter marks of 3 subjects");
        i=in.nextInt();
        j=in.nextInt();
        k=in.nextInt();
    }


    public void printData(){
        percentage =(i+j+k)/3;
        if(percentage>100){
            System.out.println("Invalid data entered");
        }else {
            System.out.print("Percentage of " + name +" is "+percentage);
            if(percentage<35){
                System.out.print(" Student Failed in the exam");
            } else if(percentage>=35 && percentage <50){
                System.out.print(" and grade is  C ");
            }
            else if(percentage>=50 && percentage <60){
                System.out.print(" and grade is  C+");
            }
            else if(percentage>=60 && percentage <70){
                System.out.print(" and grade is  B ");
            }else if(percentage>=70 && percentage <80){
                System.out.print(" and grade is   B+ ");
            }else if(percentage>=80 && percentage <90){
                System.out.print(" and grade is   A ");
            }else {
                System.out.print(" and grade is A+ ");
            }
        }
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.getData();
        s.printData();
    }
}
