// WAP which should accept 3 arguments via command line of type operand, operator and operand and
// should display the result by performing appropriate calculation.

public class Program3 {
    public static void main(String[] args) {
        int operand1 = Integer.parseInt(args[0]);
        String operator = args[1] ;
        int operand2 = Integer.parseInt(args[2]);

        if (operator.equalsIgnoreCase("+")) {
            System.out.println("Sum is " + ( operand1+operand2 ));
        } else if(operator.equalsIgnoreCase("-")){
            System.out.println("Difference is " + ( operand1 - operand2));
        } else if (operator.equalsIgnoreCase("*")) {
            System.out.println("Multiplication is " + ( operand1 * operand2));
        } else if (operator.equalsIgnoreCase("/")) {
            System.out.println("Multiplication is " + ( operand1 / operand2));
        }
        else{
            System.out.println("Enter valid operation");
        }
    }
}
