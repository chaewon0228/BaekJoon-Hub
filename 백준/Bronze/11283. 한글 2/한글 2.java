import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char w = sc.next().charAt(0);
		int word = (int)w;

		// 가는 아스키코드 44031번이다.
        System.out.println(word - 44031);
        sc.close();
	}
}