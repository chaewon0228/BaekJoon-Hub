import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] level = new int[4];
		for(int i=0; i<4; i++) {
			level[i] = sc.nextInt();
		}
		Arrays.sort(level);
		
		int one = level[0] + level[3];
		int two = level[1] + level[2];
		System.out.println(Math.abs(one - two));
	}
}
