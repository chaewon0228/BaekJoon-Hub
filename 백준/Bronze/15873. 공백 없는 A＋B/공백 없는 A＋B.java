import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ab = sc.nextInt();
        
		int result = (ab % 10) + (ab / 10);
		if(ab / 10 > 10) result = (ab / 100) + (ab % 100);
		if(ab == 1010) result = 20;
		System.out.println(result);
	}
}