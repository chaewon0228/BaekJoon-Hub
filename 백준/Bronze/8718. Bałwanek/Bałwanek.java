import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 공원에 있는 눈
		int k = sc.nextInt(); // 카시아가 만든 눈
		
		// k     2k    4k    7k <= x
		// 1/2k  k     2k    7/2k <= x
		// 1/4k  1/2k   k    7/4k <= x
		int top = 0, middle = 0, bottom = 0;
		x *= 1000;
		if(7000 * k <= x) top = 7000 * k;
	    if(3500 * k <= x) middle = 3500 * k;
	    if(1750 * k <= x) bottom = 1750 * k;
		System.out.println(Math.max(Math.max(top, middle), bottom));
		sc.close();
	}
}