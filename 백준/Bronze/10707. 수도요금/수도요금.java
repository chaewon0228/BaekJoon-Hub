import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // X사의 1리터당 요금
		int b = sc.nextInt(); // Y사의 기본요금
		int c = sc.nextInt(); // Y사의 사용량 상한
		int d = sc.nextInt(); // Y사의 1리터당 추가요금
		int p = sc.nextInt(); // 한 달간 수도의 양
		
		int x = a * p;
		int y = b;
		if(p >= c) y += (p - c) * d;
		System.out.println(x > y ? y : x);
	}
}