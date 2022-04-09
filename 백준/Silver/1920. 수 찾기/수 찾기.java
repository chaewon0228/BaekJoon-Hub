import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();
		
		Arrays.sort(a);
		int result = 0, input;
		int m = sc.nextInt();
		for(int i=0; i<m; i++) {
			input = sc.nextInt();
			if(0 > Arrays.binarySearch(a, input)) result = 0;
			else result = 1;
			System.out.println(result);
		}
		
	}
}