public class SwapWithouUsingThirdVariable {
    public static void main(String [] args){
        int a = 10 ,b = 30;
        a = a+b ; //40
        b = a-b ; //10
        a = a-b; //30

        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}
