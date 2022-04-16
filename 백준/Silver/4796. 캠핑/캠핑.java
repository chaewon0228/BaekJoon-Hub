import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p, l, v;
		int cnt = 0, result = 0;
		while(true) {
			cnt++;
			l = sc.nextInt(); // 캠핑장 사용 가능 기간
			p = sc.nextInt(); // 연속하는 기간
			v = sc.nextInt(); // 휴가 기간
			if(p == 0 && l == 0 && v == 0) break;
			result = (v / p) * l + Math.min((v % p), l);
			System.out.println("Case " + cnt + ": " + result);
		}
	}
}