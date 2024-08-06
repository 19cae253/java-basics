package shasha;
import java.util.Scanner;
public class Swappingnumberswithvariable {
public static void main(String[]args) {
	int a , b , c;
	Scanner obj=new Scanner(System.in);
	System.out.println("The numbers are:");
	a=obj.nextInt();
	b=obj.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println("Swapping numbers are:");
	System.out.println(a);
	System.out.println(b);
}
}
