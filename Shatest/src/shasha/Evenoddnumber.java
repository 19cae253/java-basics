package shasha;
import java.util.Scanner;
public class Evenoddnumber {
public static void main (String[]args) {
	System.out.println("Enter a number:");
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	if (n%2==0) {
		System.out.println("The number " + n + " is even");
	}
		else {
			System.out.println("The number " +n + " is odd");
		}
	}
}
