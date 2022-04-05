import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); // 정육각형 한 변의 길이
		
		// 이등변 삼각형 : 120, 30, 30
		// 제일 작은 삼각형의 넓이 구하기 (밑변: Math.sqrt(3) / 2 * l)
		double result = (Math.sqrt(3) / 4) * Math.pow(l, 2);
		System.out.println(result);
	}
}