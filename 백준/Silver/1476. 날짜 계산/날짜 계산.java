import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt(); // 지구
		int s = sc.nextInt(); // 태양
		int m = sc.nextInt(); // 달
		int earth = 1, sun = 1, moon = 1;
		int result = 1;
		while(true) {
			  if(earth == 16) earth = 1;
			  if(sun == 29) sun = 1;
			  if(moon == 20) moon = 1;
			  if(e == earth && s == sun && m == moon) break;
			  earth++; sun++; moon++; result++;
		}
		System.out.println(result);
	}
}