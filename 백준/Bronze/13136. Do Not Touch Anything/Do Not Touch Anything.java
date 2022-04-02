import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(); // 가로
		int c = sc.nextInt(); // 세로
		int n = sc.nextInt(); // 한 대의 CCTY가 수용할 수 있는 범위
		
        long row = r / n + (r % n == 0 ? 0 : 1);
		long col = c / n + (c % n == 0 ? 0 : 1);
		System.out.println(row * col);
	}
}