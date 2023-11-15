// WAP to calcuate and print area and circumference of a Circle. Assume that radius is an itneger and initialize it to any vale of your choice.



public class Program3 {
    public static void main(String[] args) {
        int radius = 10;
        
        double area , circumference;
        area = 3.14*radius*radius;
        circumference = 2*3.14*radius;

        System.out.println("Area of circle is "+area);
        System.out.println("Circumference of circle is "+circumference);
    }
}

// method 2

class method2 {
    public static void main(String[] args) {
        int radius = 10;
        
        double area , circumference;
        area = Math.PI*Math.pow(radius,2);
        circumference = 2*Math.PI*radius;

        System.out.println("Area of circle is "+area);
        System.out.println("Circumference of circle is "+circumference);
    }
}
// method 3 =  type casting 

class method3 {
    public static void main(String[] args) {
        int radius = 10;
        float area , circumference; 

        area = (float)(Math.PI*Math.pow(radius,2));
        circumference = (float)(2*Math.PI*radius);

        System.out.println("Area of circle is "+area);
        System.out.println("Circumference of circle is "+circumference);
    }
}