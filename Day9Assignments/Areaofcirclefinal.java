package StringAssignments;

import java.util.Scanner;

public class Areaofcirclefinal {
    public final float pi =3.14f;


    public   float area(int r){
        return (pi*r*r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius ");
        int r = in.nextInt();
        Areaofcirclefinal a =new Areaofcirclefinal();
        System.out.println("Area of circle "+ a.area(r));
    }


}
