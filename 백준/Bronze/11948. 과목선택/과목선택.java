import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[4];
		int[] h = new int[2];
		
		for(int i=0; i<4; i++) {
			s[i] = sc.nextInt();
		}
		h[0] = sc.nextInt();
		h[1] = sc.nextInt();
		
		Arrays.sort(s);
		
		System.out.println(s[3] + s[2] + s[1] + Math.max(h[0], h[1]));
	}
}
