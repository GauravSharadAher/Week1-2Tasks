

import java.util.Scanner;

public class Sqrtofnumber {


    int num;

    public void getData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        num = in.nextInt();
    }
    public double findSqrt(){
        return Math.pow(num,0.5);
    }

    public static void main(String[] args) {
        Sqrtofnumber s= new Sqrtofnumber();
        s.getData();
        System.out.println(s.findSqrt());

    }
}
