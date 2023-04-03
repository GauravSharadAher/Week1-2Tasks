package StringAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class TechN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        String s= in.nextLine();
        //2025

        //Method using Array Method 1:
        if((s.length())%2==0){
            char [] arr =s.toCharArray();
            int mid= arr.length/2;
            int num1=0;
            int num= (int) Math.pow(10, (mid)-1);
            System.out.println(num);
            for (int i = 0; i <mid; i++) {
                System.out.println(arr[i]);
                int n=Integer.parseInt(String.valueOf(arr[i]));
                 num1=((arr[i])*num)+num1;
                System.out.println(num1);
                num=num/10;

            }






        }else {
            System.out.println("Invalid data entered");
        }













        // Method using mod METHOD 2:
//        int len=s.length();
//        if(len%2==0){
//            int num=Integer.parseInt(s);
//            int check =num;
//            int num1=1;
//            int i=1;
//            int num2=0;
//            while(i<=len/2){
//                int rem=num%10;
//                num2 =num2+rem*num1;
//                num1=num1*10;
//                num=num/10;
//                i++;
//            }
//            System.out.println(num);
//            if(check==((num+num2)*(num+num2))){
//                System.out.println("Number is tech");
//            }
//            else {
//                System.out.println("Not a tech number");
//            }
//        }
//        else {
//            System.out.println("Invalid data entered");
//        }

            //  Method using substring Method 3:

//        if(len%2==0){
//            String str1= s.substring(0,len/2);
//            String str2= s.substring(len/2,len);
//            int num1= Integer.parseInt(str1);
//            int num2= Integer.parseInt(str2);
//            int num3=(num1+num2)*(num1+num2);
//            int num4= Integer.parseInt(s);
//            if(num3==num4){
//                System.out.println("Given number is a TechNumber");
//            }
//            else{
//                System.out.println("Given number is not a TechNumber");
//            }
//        }
//        else{
//            System.out.println("Entered number cannot be checked");
//        }
    }
}
