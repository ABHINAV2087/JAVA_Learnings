import java.util.Scanner;

public class Loopsmethod2 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int a , b ;
        String s;
        do {
            System.out.println("enter num1 :");
            a = sc.nextInt();
            System.out.println("enter num2 :");
            b = sc.nextInt();
            System.out.println("sum of num1 and num2 is : " +(a+b));
            System.out.println("Do You want to continue if yes then press Y if you want to exit press N");
            sc.nextInt();
            s = sc.nextLine();
            
            
        } while (s.equalsIgnoreCase("y"));
}
}