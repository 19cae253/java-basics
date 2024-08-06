package shasha;
import java.util.Scanner;
public class Reversenum {
public static void main(String[]args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=obj.nextInt();
	int  i=0,j=0;
	while(n>0) {
		i=n%10;
		j=(j*10)+i;
		n/=10;	
	}
	System.out.println("The reverse number is "+j);
}
}
