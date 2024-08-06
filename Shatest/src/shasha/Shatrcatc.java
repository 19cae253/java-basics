package shasha;
import java.util.Scanner;
public class Shatrcatc {
	public static int dividenum(int a, int b) {
		return a/b;
	}
public static void main(String[]args) {
	Scanner obj=new Scanner(System.in);
	Integer num=obj.nextInt();
	Integer num1=obj.nextInt();
	try{int div=dividenum(num,num1);
	
		System.out.println(div);
	}
	catch(Exception e){
		System.out.println("cant divide with 0");
	}
}
}

