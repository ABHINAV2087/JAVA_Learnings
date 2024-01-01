import java.util.Scanner;


class Student {
     int roll;
     String name;
     double per;
    
    public void setStudent(int r,String n,double p){
        roll = r;
        name = n;
        per = p;
        
    }
    public void showStudent(){
        System.out.println("roll = "+roll+", grade = "+per+", name = "+name);
    }
}


public class PracticeProgram1 {
    
        public static void main(String[] args){ 
            Scanner sc = new Scanner(System.in);
            System.out.println();
            int r = sc.nextInt();
            String n  = sc.next();
            double p = sc.nextDouble();
            Student s = new Student();
            s.setStudent(r, n, p);
            s.showStudent();
        }
    
}
