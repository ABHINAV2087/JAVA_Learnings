/*


WAP to create an array of 'n' integers, where 'n' should be taken from the user. 
Then ask the user to input values in the array and finally 
calculate the sum and average of all the elements of the array.


*/ 


import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int a = sc.nextInt();;
        int[] arr = new int[a];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<a;i++){
            System.out.println("Enter the element for index "+ i);
            arr[i] = sc.nextInt();
        
        };
        System.out.print("The Sum of array elements is : ");
        int sum = 0;
        for(int i = 0; i<a;i++){
            sum = sum + arr[i];

        }
        System.out.println(sum);
        System.out.println("");
        System.out.print("The average of all elements of array is : ");
        double avg = (sum/a);
        System.out.print(avg);
    }
}
