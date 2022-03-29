import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt(); 
		int day = sc.nextInt(); 
		String result = "";
		if(month <= 2 && day < 18 || month < 2) result = "Before";
		else if(month == 2 && day == 18) result = "Special";
		else result = "After";
		System.out.println(result);
	}
}
