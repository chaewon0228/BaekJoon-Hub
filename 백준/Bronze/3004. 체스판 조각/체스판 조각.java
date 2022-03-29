import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = n / 2 + 1;
		int col = n - row + 2;
		System.out.println(row * col);
	}
}
