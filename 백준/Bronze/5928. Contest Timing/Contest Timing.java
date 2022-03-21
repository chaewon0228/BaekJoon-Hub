import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		int start = (11 * 60 * 24) + (11 * 60) + 11;
		int result = ((d * 60 * 24) + (h * 60) + m) - start;
		if(result < 0) System.out.println(-1);
		else System.out.println(result);
		sc.close();
	}
}