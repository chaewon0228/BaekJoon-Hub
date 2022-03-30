import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long pibo = 0;
		long pibo2 = 1, temp = 1;
		for(int i=0; i<n; i++) {
			temp = pibo + pibo2;
			pibo = pibo2;
			pibo2 = temp;
		}
		System.out.println(pibo);
	}
}
