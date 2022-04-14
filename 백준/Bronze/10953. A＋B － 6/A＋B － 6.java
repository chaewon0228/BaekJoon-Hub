import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] result = new int[t];
		String ab; int sum;
		for(int i=0; i<t; i++) {
			ab = sc.next();
			sum = Integer.parseInt(ab.substring(0, 1)) + Integer.parseInt(ab.substring(2));
			result[i] = sum;
		}
		for(int i:result) {
			System.out.println(i);
		}
	}
}
