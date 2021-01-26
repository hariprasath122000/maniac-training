package practice;
import java.util.*;
public class Comparefloat {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter two float values:");
		float a=in.nextFloat();
		float b=in.nextFloat();
		if(a==b)// check whether the two values are same or not
			System.out.println("both values are same");
		else
			System.out.println("both values are not same");
	}

}
