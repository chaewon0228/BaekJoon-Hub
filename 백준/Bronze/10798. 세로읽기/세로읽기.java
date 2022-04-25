import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] c = new char[5][15];
		String str;
		for(int i = 0; i < 5; i++) {
			str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				c[i][j] = str.charAt(j);
			}
		}
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++){
				// '\0'은 null이다.
				if(c[j][i] == ' ' || c[j][i] == '\0') continue;
				bw.write(c[j][i]);	
			}
		}
		bw.flush();
	}
}