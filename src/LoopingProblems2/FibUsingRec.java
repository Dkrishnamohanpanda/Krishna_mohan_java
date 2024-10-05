package LoopingProblems2;

import java.net.SocketOption;

public class FibUsingRec {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int count =10;
        System.out.println("fibonacci series");
        for(int i=0;i<count;i++){
            System.out.println(fibonacci(i) +" ");
        }

    }
}

