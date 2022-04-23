import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 도화지 크기 : 100 x 100
		// 색종이 크기 :  10 x  10
		int cnt = sc.nextInt(); // 색종이의 수
		int[][] offset = new int[100][100];
		int x, y, result = 0;
		for(int i=0; i<cnt; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					offset[j][k] = 1; 
				}
			}
		}
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(offset[i][j] == 1) result++;
			}
		}
		System.out.println(result);
	}
}