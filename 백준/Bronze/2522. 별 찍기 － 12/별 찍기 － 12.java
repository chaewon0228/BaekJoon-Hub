import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i<=n; i++) {
			for(int j = n - i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j =i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j =i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}