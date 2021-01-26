package practice;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
	
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the number :");
           int n=in.nextInt();
            int c;
            if(n<100)
            	c=1;
            else
            	c=2;
            switch(c)
            {
            case 1:
            {
            	n=n-5;
            	 System.out.println(n);
            	break;
            }
            case 2:
            {
            	n=n+5;
            	 System.out.println(n);
            	break;
            }
               
            }
	}

}
