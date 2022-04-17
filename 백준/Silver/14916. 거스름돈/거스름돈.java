import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		while(n > 0) {
			if(n % 5 == 0) {
				result += n / 5;
				break;
			}
			n -= 2;
			result++;
		}
		if(n < 0) System.out.println(-1); 
		else System.out.println(result);
	}
}