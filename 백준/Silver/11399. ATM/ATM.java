import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				sum += p[j];
			}
		}
		System.out.println(sum);
	}
}