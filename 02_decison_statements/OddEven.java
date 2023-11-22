/**
 * OddEven
 */
public class OddEven {

    public static void main(String[] args) {
        int a,b;
        
        a = Integer.parseInt(args[0]);
        b = a%2;
        if (b == 0 ) {
            System.out.println("the number entered is EVEN");
        } else {
            System.out.println("the number entered is ODD");
        }
    }
}