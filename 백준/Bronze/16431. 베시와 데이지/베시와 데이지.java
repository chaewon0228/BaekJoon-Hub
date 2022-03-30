import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int br = sc.nextInt(); // 베시의 좌표
		int bc = sc.nextInt(); 
		int dr = sc.nextInt(); // 데이지의 좌표
		int dc = sc.nextInt(); 
		int jr = sc.nextInt(); // 존의 좌표
		int jc = sc.nextInt(); 
		
		String result = "";
		int b = Math.max(Math.abs(jr - br), Math.abs(jc - bc));
		int d = Math.abs(jr - dr) + Math.abs(jc - dc);
		if(b > d) result = "daisy";
		else if(b < d) result  = "bessie";
		else result = "tie";
		System.out.println(result);
	}
}
