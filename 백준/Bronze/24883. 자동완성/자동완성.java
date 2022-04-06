import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String result = "";
		if(a.toUpperCase().equals("N")) result = "Naver D2";
		else result = "Naver Whale";
		
		System.out.println(result);
	}
}