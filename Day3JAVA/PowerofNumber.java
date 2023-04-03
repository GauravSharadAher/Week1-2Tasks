

import java.util.Scanner;

public class PowerofNumber {
    double num;
    int pov;
    double display=1;
    public double powerf(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number");
        num=in.nextInt();
        System.out.println("Enter value of power");
        pov=in.nextInt();
        for(int i=1; i<=pov; i++){
            display=display*num;
        }
        return display;
    }

    public static void main(String[] args) {
        PowerofNumber p= new PowerofNumber();
        System.out.println(p.powerf());
    }
}
