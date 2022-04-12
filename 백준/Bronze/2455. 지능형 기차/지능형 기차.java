import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 기차 안에 사람이 가장 많을 때의 사람 수
		int out, in;
		int sum = 0, max = 0;
		for(int i=0; i<4; i++) {
			out = sc.nextInt();
			in = sc.nextInt();
			sum += in - out;
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}