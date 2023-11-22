/**
 * Program2 
 * A company provides insurance to it's employees according to
    the following criteria:
        If the employee is married
        If the employee is unmarried, male and above 35 years of age 
        If the employee is unmarried, female and above 30 years of age

   In all other cases insurance is not given. WAP to accept age, gender and marital status from the user using command line arguments and check whether the user is eligible for insurance or not
 */
public class Program2 {
 public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    String gender = args[1];
    String status = args[2];

    if (status.equalsIgnoreCase("married")) {
        System.out.println("you are eligible for insurance");
    } 
    else if( gender.equalsIgnoreCase("male") && status.equalsIgnoreCase("unmarried") && age >35 ){
         System.out.println("you are eligible for insurance");
    }
    else if( gender.equalsIgnoreCase("female") && status.equalsIgnoreCase("unmarried") && age >30 ){
         System.out.println("you are eligible for insurance");
    }
    else {
        System.out.println("you are not elgible for insurance");
    }
 }  
    
}

// isme hum string ko == se compare nhi kr skte isiliye 
// .equalsIgnoreCase() use krenge


// WAP to accept a month number from the user via command line argument and display the name of the season in which 
// the month falls 
// => 11,12,1,2 - winter 
// => 3,4,5,6 - summmer 
// => 7,8,9,10 - rainy 
// => any other value - wrong input 

class Switchprogram{
    public static void main(String[] args) {
        switch (args[0]) {
            case "11":case "12":case "1":case "2":
                System.out.println("winter season");
                break;
            case "3":case "4":case "5":case "6":
                System.out.println("summer season");
                break;
            case "7":case "8":case "9":case "10":
                System.out.println("rainy season");
                break;
        
            default:
                 System.out.println("invalid input");
                break;
        }
    }
} 