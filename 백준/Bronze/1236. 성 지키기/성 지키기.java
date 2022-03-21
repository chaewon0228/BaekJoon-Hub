import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int cnt = 0;
		String[] stat = new String[n];
		boolean chk = false;
		for(int i=0; i<n; i++) {
			stat[i] = br.readLine();
			if(stat[i].contains("X") == false) cnt++;
		}
		int row = cnt; cnt = 0;
		
		for(int i=0; i<m; i++) {
			int col = 0;
			for(int j=0; j<n; j++) {
				if(stat[j].charAt(i) == '.') col++;
			}
			if(col == n) cnt++;
		}
		System.out.print(Math.max(row, cnt));
	}
}
