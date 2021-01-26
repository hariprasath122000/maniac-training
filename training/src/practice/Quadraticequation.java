package practice;
import java.util.*;
public class Quadraticequation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value of a,b,c");
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
		double r=b*b - 4.0*a*c;// it is b^2-4ac
		double r1,r2;
		if(r>0.0)// check only when b^2-4ac is greater than 0 because negative leads to i in sqrt
		{
			r1=(-b + Math.pow(r,0.5))/(2.0 *a);
			r2=(-b - Math.pow(r,0.5))/(2.0 *a);
			System.out.println(+r1+" "+r2);
		}
		else if(r==0.0)// we can avoid sqrt when it is 0
		{
			r1=-b/(2.0 *a);
			System.out.println(r1);
		}
		else
			System.out.println("it has no roots");
	}

}
