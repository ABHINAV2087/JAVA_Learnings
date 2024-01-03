/**
 * ConstructorOverloading
 */
class Box{
    private int l,b,h;

    public Box(){
        l=b=h=0;
    }
    public Box(int s){
        l=b=h=s;
    }
    public Box(int i, int j, int k){
        l=i;
        b=j;
        h=k;
    }
    public Box(Box P){
        l = P.l;
        b = P.b;
        h = P.h;
    }
    public void show(){
        System.out.println(l+","+b+","+h);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10);
        Box b3 = new Box(5,7,9);
        Box b4 = new Box(b3);
        b1.show();
        b2.show();
        b3.show();
        b4.show();


    }
    
}