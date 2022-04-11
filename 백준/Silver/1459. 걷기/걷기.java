import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		long w = sc.nextLong();
		long s = sc.nextLong();
		
		long diff1, diff2, diff3;
		
		// 한 블록씩
		diff1 = (x + y) * w;
		
		// 대각선
		if((x + y) % 2 == 0) diff2 = Math.max(x, y) * s;
		else diff2 = (Math.max(x, y) - 1) * s + w;
		
		// 한 블록씩 + 대각선
		diff3 = (Math.min(x, y) * s) + (Math.abs(x - y) * w);
		
		System.out.println(Math.min(Math.min(diff1, diff2), diff3));
	}
}