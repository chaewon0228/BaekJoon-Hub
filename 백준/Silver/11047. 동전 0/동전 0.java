import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 동전의 종류
		int k = sc.nextInt(); // 가치의 합
		int[] a = new int[n];
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = n - 1; i >= 0; i--) {
			if(!(k > 0)) break;
			cnt += k / a[i];
			k %= a[i];
		}
		System.out.println(cnt);
	}
}