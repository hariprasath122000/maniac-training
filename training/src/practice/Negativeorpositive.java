package practice;
import java.util.*;
public class Negativeorpositive {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
        int n=in.nextInt();
        if(n<0)//check for the number is negative
        	System.out.println("negative");
        else //if it is not negative then it must be a positive
        	System.out.println("positive");
	}

}
