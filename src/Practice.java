import java.util.Scanner;

public class Practice {
    public static void main(String[]args) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a number :");
            int no1 = s.nextInt();
            System.out.println("enter a number :");
            int no2 = s.nextInt();
            System.out.println("select the symbol(+,-,*,/)");
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition is :" + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("substraction is :" + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("multiplication is :" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("dividing is :" + res);
                    break;
                default:
                    System.out.println("Invalis symbol entered");
                    break;
            }
            System.out.println("do you want to continue(enter y for yes and enter n for no)");
            yn =s.next();
        }while (yn.equals("y") || yn.equals("Y"));
    }

}
