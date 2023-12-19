import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][4];
        System.out.println("enter the array elements");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                 System.out.println("enter the element for arr"+i+","+j);
                arr[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        int sum = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(" ");
        System.out.println("the sum of all elements is : "+sum);
        System.out.println("the avg of all elements is : "+ (float)sum/12);
    }
    
}