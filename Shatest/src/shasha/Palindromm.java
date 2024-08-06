package shasha;
import java.util.Scanner;
public class Palindromm {
public static void main(String[]args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=obj.nextInt();
	int a=n,i=0,j=0;
	
	while(a>0) {
		i=a%10;
	    j=(j*10)+i;
	    a/=10;
	}
	   if(n==j) {
		   System.out.println("It is palindrome");
	   }
	   else {
		   System.out.println("It is not palindrome");

	   }
	}
}
