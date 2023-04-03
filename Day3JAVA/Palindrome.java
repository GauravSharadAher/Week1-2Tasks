

import java.util.Scanner;

public class Palindrome {
    String input;

    public boolean pali(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data to be checked whether it is palindrome or not");
        input = in.nextLine();
        input = input.toLowerCase();

        if(input.length()==0 || input==null)
        {
            return true;
        }else {
            for (int i = 0; i < input.length(); i++) {
                char start = input.charAt(i);
                char end = input.charAt(input.length()-i-1);
                if(start!=end){
                    return  false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Palindrome p= new Palindrome();
        System.out.println(p.pali());
    }
}
