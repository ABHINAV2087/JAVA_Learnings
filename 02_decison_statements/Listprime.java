import java.util.Scanner;

public class Listprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("enter a number : " );
        n = sc.nextInt();
        for(int i = 2;i<=n;i++ ){
            int j;
            for (j = 2 ;j<=i-1;j++){
                if(i%j==0)
                break ;
            }
            if(j==i){
                System.out.println(j);
            }
        }
    }
}
