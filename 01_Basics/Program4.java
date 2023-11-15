// WAP to implement Pythagoran theorem. Assume the value of p and b and calculate h.

public class Program4 {
    public static void main(String[] args) {
        double perpendicular = 3;
        double base = 4;

        double sum = (Math.pow(perpendicular,2)) + (Math.pow(base, 2));
        double hypotenuse =  Math.sqrt(sum);

        System.out.println("The hypotenuse of the triangle is "+hypotenuse);
    }
}
