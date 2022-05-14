import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nan = new int[9];
		int[] chk = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			nan[i] = Integer.parseInt(br.readLine());
			sum += nan[i];
		}
		sum -= 100;
		
		boolean find = false;
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(nan[i] + nan[j] == sum) {
					chk[i] = 1;
					chk[j] = 1;
					find = true;
					break;
				}
			}
			if(find) break;
		}
		
		for(int i = 0; i < 9; i++) {
			if(chk[i] != 1) System.out.println(nan[i]);
		}
	}
}