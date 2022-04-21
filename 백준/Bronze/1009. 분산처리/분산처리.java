import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b;
		int result;
		for(int i=0; i<t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			result = 1;

			for(int j=0; j<b; j++) {
				result = result *  a % 10;
			}
			result = result == 0 ? 10 : result;
			System.out.println(result);
		}
	}
}