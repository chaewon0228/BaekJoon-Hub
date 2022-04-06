import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bee = new int[3]; 
		for(int i=0; i<3; i++) bee[i] = sc.nextInt();
		
		// 가장 꿀벌이 많은 꽃에서 꿀벌이 날아와야 한다.
		int avg = (bee[0] + bee[1] + bee[2]) / 3;
		Arrays.sort(bee);
		
		int result = (avg - bee[1]) + (2 * (avg - bee[2]));
		System.out.println(Math.abs(result));
	}
}