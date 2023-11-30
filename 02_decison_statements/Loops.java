/*
 
WAP to accept two integer from the user and display their sum. 
Now ask the user whether he/she wants to continue or not.
If the answer is Yes then again repeat the process otherwise terminate the program displaying the message “Thank you”
 */

 import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        char s,result ;
        do {
            System.out.println("enter num1 :");
            a = sc.nextInt();
            System.out.println("enter num2 :");
            b = sc.nextInt();
            System.out.println("sum of num1 and num2 is : " +(a+b));
            System.out.println("Do You want to continue if yes then press Y if you want to exit press N");
            s = sc.next().charAt(0);
            result = Character.toLowerCase(s);
            
        } while (result == 'y');

    }
}



