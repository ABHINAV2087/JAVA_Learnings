// WAP to accept the age of the user

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age ? ");
        int age = sc.nextInt();
        System.out.println("your age is "+age);
    }
}

// ACCEPTING STRINGS FROM THE USER 


 class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Greetings Of The Day "+name);
    }
}// is method me ye problem aati hai ki jaha bhi input me space aa jata hai waha se ye input nhi leta bas space ke pehle ka hi leta hai  

// to hum dusri method use krenge 

 class StringInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Greetings Of The Day "+name);
    }
}