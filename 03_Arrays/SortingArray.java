import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int size = sc.nextInt();;
        int[] arr = new int[size];
        System.out.println("enter the elements of the array :");
        for(int i = 0 ; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("your array is :");
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("do you want to sort your array :");
        System.out.println("Do You want to continue if yes then press Y if you want to exit press N");
        char ans = sc.next().charAt(0);
        ans = Character.toLowerCase(ans);
        if (ans == 'y') {
            System.out.println("Do You want to sort the array in ascending order then press 'A' and if you want to sort in descending order then press 'D'");
            char ans1 = sc.next().charAt(0);
            ans1 = Character.toLowerCase(ans1);
            int temp = 0;
            if (ans1 == 'a') {
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        if (arr[j]<arr[i]) {
                            temp = arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
                System.out.println("your sorted array is :");
                for(int i = 0 ; i<arr.length;i++){
                     System.out.print(arr[i]+" ");
                }
                
            } else {
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        if (arr[j]>arr[i]) {
                            temp = arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
                System.out.println("your sorted array is :");
                for(int i = 0 ; i<arr.length;i++){
                     System.out.print(arr[i]+" ");
                }
            }
            
        }
        else{
            System.exit(0);
        }


    }

}




