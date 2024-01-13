/*
 * WAP to create a class called ArraySun , having a method called sum()
 * this method should accpet an integer array as argument and should return
 * the sum of all the elements of array 
 */

package Problems;

class ArraySum{
    public void sum(int [] brr){
        int sum = 0;
        for(int i=0;i<brr.length;i++){
            sum = sum + brr[i];
        }
        System.out.println("the sum of elements of array is :"+sum);
    }
    public double [] calculate(int [] brr){
        int sum = 0;
        for(int i=0;i<brr.length;i++){
            sum = sum + brr[i];
        }
        double [] ans = new double[2];
        ans[0] = sum;
        ans[1] = (double)sum/brr.length;
        return ans;
    }
}


public class PracticeProblem2 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};

    ArraySum A = new ArraySum();
     A.sum(arr);
    }
 }
