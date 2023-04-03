

import java.util.Scanner;

public class Areaofrect {
    double length,breadth;

    public double area(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter length of rectangle ");
        length=in.nextInt();
        System.out.println("Enter breadth of rectangle ");
        breadth=in.nextInt();
        System.out.print("Area of rectangle is: ");
        return  length*breadth;
    }

    public static void main(String[] args) {
        Areaofrect a=new Areaofrect();
        System.out.println(a.area());
    }
}
