package shasha;

public class Countodd {
	public static void main(String[]args) {
		int a=0;
		for(int i=0;i<=100;i++) {
			if (i%2==1) {
				a=a+1;
			}
		}
		System.out.println(a);
}
}
