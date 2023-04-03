

import java.util.Scanner;

public class Armstrong {

    String num;

    public boolean arms(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=in.next();
        int count=num.length();
        int newnum = Integer.parseInt(num);
        int temp=newnum;
        double  sum=0;
        while(newnum>0){
            int rem=newnum%10;
            sum=  (sum+Math.pow(rem,count));
            newnum=newnum/10;
        }
        if(sum==temp){
            return true;
        }return false;
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        System.out.println(a.arms());
    }
}
