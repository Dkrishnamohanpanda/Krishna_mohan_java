package LoopingProblems2;

import java.util.SortedMap;

public class Palindrome {
    public static void main(String []args){
        int no = 121;
        int temp = no;
        int rev=0,rem;
        while(no!=0){
            rem= no%10;
            rev  =rev*10+rem;
            no=no/10;

        }
        if (temp == rev){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }
}
