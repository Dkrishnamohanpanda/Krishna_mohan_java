import java.util.Scanner;

//public class Calculator {
//    public static void main(String [] args){
//        String yn;
//        do {
//            Scanner s = new Scanner(System.in);
//            System.out.println("enter first no");
//            int no1 =s.nextInt();
//            System.out.println("enter second no");
//            int no2 =s.nextInt();
//            System.out.println("select symbol(+,-,*,/)");
//            String sym = s.next();
//            int res;
//
//            switch (sym)
//            {
//                case"+":res=no1+no2;
//                    System.out.println("Addition is :"+res);
//                    break;
//                case"-":res=no1-no2;
//                    System.out.println("substraction is :"+res);
//                    break;
//                case"*":res=no1+no2;
//                    System.out.println("multiplication is :"+res);
//                    break;
//                case"/":res=no1+no2;
//                    System.out.println("substraction is :"+res);
//                default:System.out.println("invalid Symbol" );
//                    break;
//
//            }
//            System.out.println("Do you want to continue(press y  for yes and n for no)");
//            yn =s.next();
//
//
//        }while (yn.equals("y")||yn.equals("Y"));
//    }
//
//}
class Calculator{
    public static void main (String [] args)
    {
        String yn;
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a no :");
            int no1 = s.nextInt();
            System.out.println("enter your second no");
            int no2 = s.nextInt();
            System.out.println("select symbol(+,-,*,/)");
            String sym =s.next();
            int res;
            switch (sym)
        {
                case"+":res=no1+no2;
                    System.out.println("Addition is :" +res);
                    break;
                case"-":res=no1-no2;
                    System.out.println("Addition is :" +res);
                    break;
                case"*":res=no1*no2;
                    System.out.println("Addition is :" +res);
                    break;
                case"/":res=no1/no2;
                    System.out.println("Addition is :" +res);
                    break;
                default:System.out.println("invalid symbol");
                    break;

            }
            System.out.println("Do you want to continue(press y for yes and n for no)");
            yn = s.next();
        }while(yn.equals("y") || yn.equals("Y"));
    }
}