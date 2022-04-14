import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[9];
		int sum = 0;
		int len = input.length;
		
		for(int i=0; i<len; i++) {
			input[i] = Integer.parseInt(br.readLine());
			sum += input[i];
		}
		sum -= 100; // 가짜 난쟁이의 합
		
		boolean chk = false;
		for(int i=0; i<len; i++) {
			if(chk) break;
			for(int j=i+1; j<len; j++) {
				if(input[i] + input[j] == sum) {
					input[i] = 0;
					input[j] = 0;
					chk = true;
					break;
				}
			}
		}
		Arrays.sort(input);
		for(int i=2; i<len; i++) {
			System.out.println(input[i]);
		}
	}
}