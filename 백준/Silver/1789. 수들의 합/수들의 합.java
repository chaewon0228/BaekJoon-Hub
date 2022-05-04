import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long sum = 0;
		
		int i = 0, cnt = 0;
		while(true) {
			sum += ++i;
			if(sum > s) break;
			cnt++;
		}
		System.out.println(cnt);
	}
}