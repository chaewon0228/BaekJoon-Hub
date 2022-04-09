import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b1 = sc.next();
		String b2 = sc.next();
		
		Long mult = Long.parseLong(b1, 2) * Long.parseLong(b2, 2);
		String result = Long.toBinaryString(mult);
		System.out.println(result);
	}
}