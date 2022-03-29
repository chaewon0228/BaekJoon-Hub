import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		String result = "";
		int sum = s + k + h;
		int min = Math.min(s, k);
		min = Math.min(min, h);
		
		if(sum >= 100) result = "OK";
		else {
			if(min == s) result = "Soongsil";
			else if(min == k) result = "Korea";
			else result = "Hanyang";
		}
		System.out.println(result);
	}
}