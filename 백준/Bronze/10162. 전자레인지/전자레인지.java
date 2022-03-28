import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a, b, c => 5분, 1분 10초 => 300, 60, 10
		int t = sc.nextInt();
		int[] cnt = new int[3];
		
		if(t >= 300) {
			cnt[0] += t / 300;
			t -= 300 * cnt[0];
		}
		if(t >= 60) {
			cnt[1] += t / 60;
			t -= 60 * cnt[1];
		}
		if(t % 10 != 0) {
			System.out.println(-1);
		}
		else{
			for(int i=0; i<3; i++) {
				cnt[2] = t / 10;
				System.out.print(cnt[i] + " ");
			}	
		}
	}
}