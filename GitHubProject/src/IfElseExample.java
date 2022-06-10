import java.util.Scanner;
public class IfElseExample {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int n,k;
     System.out.println("enter the value of n");
              n=scnr.nextInt();
              if(n>0) {
            	  k=n/2;
            	  System.out.println(k);
              }
              else if(n<0) {
            	  k=n*2;
            	  System.out.println(k);
         
              }
              else {
            	  System.out.println(" the result is zero");
              }
	}

}
