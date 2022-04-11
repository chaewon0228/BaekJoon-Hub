import java.util.Arrays;
import java.util.Collections;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Integer[] num = new Integer[n];
		
		for(int i=0; i<n; i++) {
	    	num[i] = Integer.parseInt(br.readLine());
		}
		
	    Arrays.sort(num, Collections.reverseOrder());
		for(int i : num) {
			wr.write(i + "\n");
		}
		wr.flush();
	}
}