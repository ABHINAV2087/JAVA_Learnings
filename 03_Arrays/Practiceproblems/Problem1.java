package Practiceproblems;

/* 
 
1. WAP to accept marks of 3 students, each having 4 subjects and calculate the total marks obtained by every student.
2. Modify the previous code so that your program also display the student number who topped the examination.

*/

import java.util.Scanner;


public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][4];
        System.out.println("enter the marks");
        int sum = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                System.out.println("enter the marks of student "+(i+1)+" for subject "+(j+1));
                arr[i][j] = sc.nextInt();
                
            }
            System.out.println(" ");
        }
     
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                sum = sum + arr[i][j];
            }
            System.out.println("Grand Total of student "+(i+1)+" is "+ sum );
            System.out.println(" ");

            sum = 0;
            
        }
        
    }
}

class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][4];
        System.out.println("enter the marks");
        int sum = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                System.out.println("enter the marks of student "+(i+1)+" for subject "+(j+1));
                arr[i][j] = sc.nextInt();
                
            }
            System.out.println(" ");
        }
        int Maxmarks = 0;
        int Topper = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                sum = sum + arr[i][j];
            }
            System.out.println("Grand Total of student "+(i+1)+" is "+ sum );
            System.out.println(" ");

            if(Maxmarks < sum){
                Maxmarks = sum;
                Topper = (i+1);
            }

            sum = 0;
            
        }
        System.out.println("topper is -> Student "+ Topper );
    }
}

