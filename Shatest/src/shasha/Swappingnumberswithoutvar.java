package shasha;
import java.util.Scanner;
public class Swappingnumberswithoutvar {
public static void main(String[]args) {
	int a,b;
	System.out.println("The numbers are:");
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swapped numbers are:");
	System.out.println(a);
	System.out.println(b); 
}

}
