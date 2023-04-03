import java.util.*;
public class Fibonacci{
int num;
    public void getNumber(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = in.nextInt();
    }

    public void fibo(){
        int f0=0;
        int f1=1;
        if(num==0){
            System.out.println(f0);

        }
        else if(num==1){
            System.out.println(f1);

        }
        else{
            System.out.println(f0);
            System.out.println(f1);
            for(int i=3; i<=num; i++){
                int f2= f1+f0;
                System.out.println(f2);
                int temp=f1;
                f1=f2;
                f0=temp;
            }
        }
    }


    public static void main(String [] args){
        Fibonacci f= new Fibonacci();
        f.getNumber();
        f.fibo();
    }

}   
      




