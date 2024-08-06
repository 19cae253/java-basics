package shasha;
import java.util.Scanner;
public class Amstrongcheck {
public static void main(String[]args) {
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=obj.nextInt();
	int a,i=0,j=0;
	a=n;
	while(a>0) {
		i=j%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if(n==j) {
		System.out.println("It is an amstrong number");
	}
	else {
		System.out.println("it is not amstrong number");
	}
	
	
}
}
