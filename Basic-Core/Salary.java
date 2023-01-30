// Salary
// ta = Travelling allowance, da = dearness Allowance, gs = gross salary, bs = base salary 
import java.util.Scanner;
public class Salary {
    int bs,ta,da,gs;
    Scanner ip=new Scanner(System.in);
    void set(){
        System.out.println("ENTER THE BASE SALARY = ");
        bs=ip.nextInt();
    }
    void cal(){
        ta = (bs*10)/100;
        da = (bs*20)/100;
        gs = ta+da+bs;
    }
    void show(){
        System.out.println("gross salary is " + gs);
    }
    public static void main(String[] args) {
        Salary ob=new Salary();
        ob.set();ob.cal();ob.show();
    }
}
