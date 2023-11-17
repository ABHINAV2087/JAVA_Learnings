// taking input using command line argument 


public class TakeInput {
    public static void main(String[] args) {
        System.out.println("hello " + args[0]);
    }
}


// javac 01_Basics\TakeInput.java  -> to compile the program

// java 01_Basics\TakeInput.java abhinav  -> to give input 

// how to convert string into int 

// parseInt()

// syntax of calling parseInt()


/*


int a;
a = Integer.parseInt(args[0]);


*/

/**
 * wap to add two numbers taking input from users from command line
 */

// we are using this because the input we are taking are in form of strings so to convert it into int we use
class Addition {
public static void main(String[] args) {
    int a,b,c;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    c = a+b;
    System.out.println("the numbers are "+a+" and" +b);
    System.out.println("and their sum is  "+c);
}
    
}