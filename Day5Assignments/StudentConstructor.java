


import java.util.Scanner;

public class StudentConstructor {

    int i, j , k ;
    String name;

    double percentage;
    public StudentConstructor(String name,int i,int j,int k){
    	this(i,j,k);
    	this.name=name;
    	
    }
    
    public StudentConstructor(int i,int j,int k){
    	this(i,j);
    	this.k=k;
    	
    }
    
    public StudentConstructor(int i,int j){
    	this(i);
    	this.j=j;
    	
    }
    public StudentConstructor(int i){
    	this.i=i;
    }
    public StudentConstructor(String name){
    
    	this.name=name;
    }
    public StudentConstructor(String name, int i){
    	this(i);
    	this.name=name;
    	
    }
public StudentConstructor(String name, int i,int j){
        
    	
    	this(i,j);
    	this.name=name;
    }
    


   public void printData(){
	   int num;
	   if(i>0&&j>0&&k>0){
		   num=3;
	   }else if(i>0&&j<=0&&k<=0){
		   num=1;
	   }
	   else {
		   num=2;
	   }
        percentage =(float)(i+j+k)/num;
        if(percentage>100){
            System.out.println("Invalid data entered");
        }else {
            System.out.print("Percentage of " + name +" is "+percentage);
            if(percentage<35){
                System.out.print(" Student Failed in the exam");
            } else if(percentage>=35 && percentage <50){
                System.out.print(" and grade is  C ");
            }
            else if(percentage>=50 && percentage <60){
                System.out.print(" and grade is  C+");
            }
            else if(percentage>=60 && percentage <70){
                System.out.print(" and grade is  B ");
            }else if(percentage>=70 && percentage <80){
                System.out.print(" and grade is   B+ ");
            }else if(percentage>=80 && percentage <90){
                System.out.print(" and grade is   A ");
            }else {
                System.out.print(" and grade is A+ ");
            }
        }
    }

    public static void main(String[] args) {
        StudentConstructor s=new StudentConstructor("Gaurav",70);
        s.printData();
    }
}

