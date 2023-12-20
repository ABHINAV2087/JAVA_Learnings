package Practiceproblems;
/*
 
3. WAP to create a 2D array of 3*3 size, accept values from the user in it and check whether it is a UNIT MATRIX or not.

 */
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter the Matrix elements");
        
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println("enter the element "+(i)+","+(j));
                arr[i][j] = sc.nextInt();
                
            }
            System.out.println(" ");
        }
        System.out.println("The input Matrix is ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
         for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if (i == j ) {
                    if ((i == j && arr[i][j] == 1) || (i != j && arr[i][j] == 0) ) {
                        System.out.println("the input matrix is a unit matrix");
                    }
                    else{
                        System.out.println("the input matrix is not a unit matrix");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}