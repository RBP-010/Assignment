package assignment;
import java.util.*;
public class Quadraticprogram {
    public static void main(String[] args) {
        double r1,r2,a,b,c,d;
        a=1;
        b=-5;
        c=4;
        d = b*b-4*a*c;
        r1 = (-b+Math.pow(d,0.5))/2*a;
        r2 = (-b-Math.pow(d,0.5))/2*a;
        System.out.println("roots of equation are:" +r1+" and "+r2);
    }
}
