import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
			
		int result = (int)Math.ceil(Math.max(a/c, b/d));
		System.out.println(l - result);
	}
}
