
import  java.util.*;

public class Displayeven {

    int start, end;

    public void getData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting number");
        start = in.nextInt();
        System.out.println("Enter ending number");
        end = in.nextInt();
    }

    public void even(){
System.out.println("Even numbers are:");
        if(start%2==0)
            System.out.println(start);
        for (int i=start+1; i<end; i++)
        {
            if(i%2==0)
                System.out.println(i);

        }
        if(end%2==0)
        {
            System.out.println(end);
        }
    }

    public static void main(String[] args) {
        Displayeven d =new Displayeven();
        d.getData();
        d.even();
    }
}