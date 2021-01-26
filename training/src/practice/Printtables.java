package practice;
import java.util.*;
public class Printtables {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int c=10;// count of the table is 1 to 10
		int n,p,i;
		System.out.println("enter the tables to print:");
		n=in.nextInt();
		for(i=1;i<=c;i++)
		{
			p=i*n;
			System.out.println(+i+"x"+n+"="+p);// prints in the format 1x2=2,...
		}
		

	}

}
