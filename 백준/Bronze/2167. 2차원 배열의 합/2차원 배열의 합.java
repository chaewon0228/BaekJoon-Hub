import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] num = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		int k = sc.nextInt();
		int i, j, x, y;
		int sum = 0;
		for(int a=0; a<k; a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			sum = 0;
			for(int b=i-1; b<x; b++) {
				for(int c=j-1; c<y; c++) {
					sum += num[b][c];
				}
			}
			System.out.println(sum);
		}
	}
}