import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = 1, b = 0;
		int temp;
		
		// a는 b가 되고, b는 ba가 됨
		for(int i=0; i<k; i++) {
			temp = a;
			a = b;
			b += temp;
		}
		System.out.println(a + " " + b);
	}
}