import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 고기의 온도
		int b = sc.nextInt(); // 목표 온도
		int c = sc.nextInt(); // 얼어 있는 고기를 데우는 시간
		int d = sc.nextInt(); // 얼어 있는 고기 해동하는 시간
		int e = sc.nextInt(); // 얼어 있지 않는 고기를 데우는 시간
		
		int time = 0;
		if(a < 0) time += c * (0 - a) + d + e * (b - 0);
		else time += e * (b - a);
		
		System.out.println(time);
	}
}