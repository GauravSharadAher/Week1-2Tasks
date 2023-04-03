package StringAssignments;

import java.util.Scanner;

public class NameUpper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String str = in.nextLine();
        Greet(str);
    }


    public  static void Greet(String naam){
        System.out.println("Hello " +naam.toUpperCase());
        System.out.println("Hello " +naam.toLowerCase());
        if(naam.startsWith("A")||naam.startsWith("a")){
            System.out.println(naam);
        }

        if(naam.endsWith("G")||naam.endsWith("g")){
            System.out.println(naam);
        }
    }
}

