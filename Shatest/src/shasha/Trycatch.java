package shasha;

public class Trycatch {
	public static int p(int a) {
		try {
			int n=a/0;
			return n;
		}
		catch(ArithmeticException e) {
			System.out.println("zero");
		}
		return 0;
	}
	public static void main(String[]args) {
            int a=5;
            public static int divnums(int a, int b){
            	return a/b;
            }
            int s=p(a);
            System.out.println(s);
	}
}