import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 1000 - sc.nextInt();
		int[] unit = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		
		for(int i=0; i<6; i++) {
			if(price / unit[i] > 0) {
				cnt += price / unit[i];
				price %= unit[i];
			}
		}
		System.out.println(cnt);
	}
}