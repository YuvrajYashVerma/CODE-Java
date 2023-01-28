//Distance in different units....

import java.util.Scanner;
public class Distance {
    double km,m,cm,inch,feet;
    Scanner ip = new Scanner(System.in);
    void set(){
        System.out.print("ENTER DISTANCE IN KILOMETER = ");
        km=ip.nextDouble();
    }
    void cal(){
        m=km*1000;
        cm=m*100;
        inch=cm/2.54;
        feet=inch*12;
    }
    void show(){
        System.out.println("DISTANCE IN METER IS "+m);
        System.out.println("DISTANCE IN CENTIMETER IS "+cm);
        System.out.println("DISTANCE IN INCH IS "+inch);
        System.out.println("DISTANCE IN FEET IS "+feet);
    }
    public static void main(String[] args) {
        Distance ob=new Distance();
        ob.set();
        ob.cal();
        ob.show();
    }
}
