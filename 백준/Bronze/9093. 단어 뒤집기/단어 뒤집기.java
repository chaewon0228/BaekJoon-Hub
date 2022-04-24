import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		String str;

		for(int i=0; i<t; i++) {
			// stack : LIFO
			Stack<Character> stack = new Stack<>();
			str = br.readLine() + "\n";
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(str.charAt(j));
				}
				else stack.push(str.charAt(j));
			}
		}
		bw.flush();
	}
}