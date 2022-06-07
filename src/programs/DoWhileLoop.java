package programs;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String args[]){
        /*Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Length:  ");
        int n=sc.nextInt();*/
        int x=1;
        do{
            System.out.println("value of x: "+x);
            x++;
        }
        while(x<10);
    }
}
