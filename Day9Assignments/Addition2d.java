package StringAssignments;

import java.util.Scanner;

public class Addition2d {



    public static void main(String[] args) {
        int arr1[][]= new int[3][3];
        int arr2[][]= new int[3][3];
        int arr3[][]= new int[3][3];
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the matrix 1 elements");
        for(int i=0; i<arr1.length; i++){

            for (int j=0; j<arr1[i].length; j++){
                arr1[i][j]= in.nextInt();
            }
        }
        System.out.println("Enter the matrix 2 elements");
        for(int i=0; i<arr2.length; i++){

            for (int j=0; j<arr2[i].length; j++){
                arr2[i][j]= in.nextInt();
            }
        }
        for(int i=0; i<arr3.length; i++){

            for (int j=0; j<arr3[i].length; j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0; i<arr1.length; i++){
            System.out.print("[");
            for (int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("]");
            if(i==1){
                System.out.print(" ");
                System.out.print("+");
                System.out.print("");
            }else
            System.out.print("  ");

            System.out.print("[");
            for (int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            } System.out.print("]");
            if(i==1){
                System.out.print(" ");
                System.out.print("=");
                System.out.print("");
            }else
            System.out.print("  ");
            System.out.print("[");
            for (int j=0; j<arr3[i].length; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("]");
        }


    }

}
