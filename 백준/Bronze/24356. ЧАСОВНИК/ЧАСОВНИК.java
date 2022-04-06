import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] time = new int[4];
		for(int i=0; i<4; i++) {
			time[i] = sc.nextInt();
		}
		time[1] += time[0] * 60;
		time[3] += time[2] * 60;
		
		if(time[1] > time[3]) time[3] += 24 * 60;
		int diff = time[3] - time[1];
		System.out.println(diff + " " + (int)(diff / 30));
	}
}