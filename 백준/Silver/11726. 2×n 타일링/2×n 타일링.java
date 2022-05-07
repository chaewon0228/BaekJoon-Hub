import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[1001];
		s[1] = 1;
		s[2] = 2;
		// 2 x n 크기의 직사각형 = 2 x (n-1) + 2 x (n-2)
		for(int i = 3; i <= n; i++) {
			s[i] = (s[i - 1] + s[i - 2]) % 10007;
		}
		System.out.println(s[n]);
	}
}