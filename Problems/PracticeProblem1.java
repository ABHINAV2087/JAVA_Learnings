/*
Create a class called Num having the following members:

    1. int a: An instance variable
    2. int b: Another instance variable
    3. setNum(): This should be parametrized method and should initialize the instance members a and b with the paramters passed
    4. swap(): This method should accept 2 arguments of type Num, and should swap their corresponsding instance memebers
    5. showNum(): To print the values of a and b

Finally design the class UseNum, having the method main(), create 2 objects of Num class called N1 and N2. Iniitalize them by callign the method setNum(),and then swap them using the method swap(). At the end display their values
*/



package Problems;

class Num{
    private int a;
    private int b;
    
    public void setNum(int x,int y){
        a = x;
        b = y;
    }
    public void swap(Num P,Num Q){
        int x;
        x = P.a;
        P.a = Q.a;
        Q.a = x;

        x = P.b;
        P.b =Q.b;
        Q.b = x;
    }
    public void showNum(){
        System.out.println("a = "+a+",b = "+b);
    }
}

public class PracticeProblem1 {
    public static void main(String[] args) {
        Num N1 = new Num();
        Num N2 = new Num();

        N1.setNum(10, 20);
        N1.setNum(30, 40);

        System.out.println("BEFORE SWAPPING");
        N1.showNum();
        N2.showNum();

        Num Temp = new Num();
        Temp.swap(N1, N2); 
        System.out.println("after SWAPPING");
        N1.showNum();
        N2.showNum();


    }
}
