
import java.util.Scanner;

public class NthprimeNumber {


    public int prime(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number tofind nth prime number ");
        int num =in.nextInt();
            int count=0;
            int i=1;
            int j;
            while(count<num){
                i=i+1;
                for ( j = 2; j <i ; j++) {
                    if(i%j==0){
                        break;
                    }
                }if(i==j){
                    count++;
                }
            }
            return i;
        }



    public static void main(String[] args) {
        NthprimeNumber  n= new NthprimeNumber();
        System.out.println(n.prime());

    }
}
