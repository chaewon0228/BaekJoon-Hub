import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int r = Rev(Rev(x) + Rev(y));
		System.out.println(r);
	}
	static int Rev(int n) {
		int result = 0;
		while(n > 0) {
			result *= 10;
			result += n % 10;
			n /= 10;
		}
		return result;
	}
}