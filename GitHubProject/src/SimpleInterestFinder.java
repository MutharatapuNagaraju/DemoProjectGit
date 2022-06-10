import java.util.Scanner;
public class SimpleInterestFinder {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int p,t,r,i;
		System.out.println("enter the total amount");
		     p=scnr.nextInt();
		     System.out.println("enter the total time");
		     t=scnr.nextInt();
		     System.out.println("enter the rate of interest");
		     r=scnr.nextInt();
		     
		     i = (p*t*r)/100;
		     
		     System.out.println("Simple interest is " + i);	
	}

}
