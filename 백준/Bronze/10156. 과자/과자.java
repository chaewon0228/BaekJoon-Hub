import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // 과자 한 개의 가격
		int n = sc.nextInt(); // 과자의 개수
		int m = sc.nextInt(); // 동수가 가진 돈
	
		int result = k * n - m;
		if(result < 0) result = 0;
		System.out.println(result);
	}
}