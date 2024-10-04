package LoopingProblems;
import java.util.Scanner;

public class FactUsingRecur {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;

        }else {
            return n*factorial(n-1);
        }
    }
    public static void main(String []args){
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number you want to : ");
        int no = s.nextInt();

        int result = factorial(no);
        System.out.println("factorial of "+no+" is: "+result);

    }
}
