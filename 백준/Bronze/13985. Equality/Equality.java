import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";
		
		int sum = str.charAt(0) - '0' + str.charAt(4) - '0';
		if(sum == str.charAt(8) - '0') result = "YES";
		else result = "NO";
		System.out.println(result);
	}
}