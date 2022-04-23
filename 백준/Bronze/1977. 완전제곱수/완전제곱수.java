import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0, min = n;
		for(int i=m; i<=n; i++) {
			for(int j=1; j<=(int)Math.sqrt(n); j++) {
				if(Math.pow(j, 2) == i) {
					sum += i;
					min = Math.min(i, min);
				}
			}
		}
		if(sum == 0) System.out.println(-1);
		else System.out.println(sum + "\n" + min);
	}
}