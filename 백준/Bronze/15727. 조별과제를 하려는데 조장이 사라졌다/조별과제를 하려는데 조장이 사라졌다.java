import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
		int result = (d % 5 == 0) ?  (d / 5) : (d / 5 + 1);
		System.out.println(result);
    }
}