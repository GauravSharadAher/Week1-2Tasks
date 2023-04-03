

import java.util.Scanner;


public class Digittoword {
    public void Digit(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter a 4 digit number: ");
        num= sc.nextInt();
        int rem[]= new int [4];
        int j=3;
        while(num>0)
        {
            rem[j]=num%10;
            j--;
            num=num/10;
        }
        for(int i=0; i<4; i++)
        {
            toWord(rem[i],i);
        }



    }

    public void toWord(int num1, int i) {

        switch(num1){

            case 0:
                if(i==1 || i==2 || i==3){
                    System.out.print(" ");
                }
                break;
            case 1:
                if(i==0){
                    System.out.print(" One Thousand");
                }
                else if(i==1){
                    System.out.print(" One Hundread");
                }
                else if(i==2){
                    System.out.print(" ten");
                }
                else {
                    System.out.print(" one");
                }
                break;
            case 2:
                if(i==0){
                    System.out.print(" Two Thousand");
                }
                else if(i==1){
                    System.out.print(" Two Hundread");
                }
                else if(i==2){
                    System.out.print(" Twenty");
                }
                else {
                    System.out.print(" Two");
                }
                break;
            case 3:
                if(i==0){
                    System.out.print(" Three Thousand");
                }
                else if(i==1){
                    System.out.print(" Three Hundread");
                }
                else if(i==2){
                    System.out.print(" Thirty");
                }
                else {
                    System.out.print(" Three");
                }
                break;

            case 4:
                if(i==0){
                    System.out.print(" Four Thousand");
                }
                else if(i==1){
                    System.out.print(" Four Hundread");
                }
                else if(i==2){
                    System.out.print(" Forty");
                }
                else {
                    System.out.print(" Four");
                }
                break;

            case 5:
                if(i==0){
                    System.out.print(" Five Thousand");
                }
                else if(i==1){
                    System.out.print(" Five Hundread");
                }
                else if(i==2){
                    System.out.print(" Fifty");
                }
                else {
                    System.out.print(" Five");
                }
                break;

            case 6:
                if(i==0){
                    System.out.print(" Six Thousand");
                }
                else if(i==1){
                    System.out.print(" Six Hundread");
                }
                else if(i==2){
                    System.out.print(" Sixty");
                }
                else {
                    System.out.print(" Six");
                }
                break;

            case 7:
                if(i==0){
                    System.out.print(" Seven Thousand");
                }
                else if(i==1){
                    System.out.print(" Seven Hundread");
                }
                else if(i==2){
                    System.out.print(" Seventy");
                }
                else {
                    System.out.print(" Seven");
                }
                break;

            case 8:
                if(i==0){
                    System.out.print(" Eight Thousand");
                }
                else if(i==1){
                    System.out.print(" Eight Hundread");
                }
                else if(i==2){
                    System.out.print(" Eighty");
                }
                else {
                    System.out.print(" Eight");
                }
                break;

            case 9:
                if(i==0){
                    System.out.print(" Nine Thousand");
                }
                else if(i==1){
                    System.out.print(" Nine Hundread");
                }
                else if(i==2){
                    System.out.print(" Ninety");
                }
                else {
                    System.out.print(" Nine");
                }
                break;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Digittoword d= new Digittoword();
        d.Digit();
    }

}
