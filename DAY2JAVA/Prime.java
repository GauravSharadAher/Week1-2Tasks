import java.util.*;
public class Prime {

    int i;
    public void getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        i = sc.nextInt();
    }
    public void primeNumber(){
        if(i==1){
            System.out.println("Not a prime number");
        }

        else if(i==2){
            System.out.println("Prime number");
        }

        else{
            int j=2;
            while(j<=Math.sqrt(i)){
                if(i%j==0){
                    System.out.println("Not a Prime number");
                    break;
                }
                j++;
            }
            if(j>Math.sqrt(i)){
                System.out.println("Prime number");

            }

        }
    }

    public static void main(String [] args){
        Prime p= new Prime();
        p.getNumber();
        p.primeNumber();
    }

}
