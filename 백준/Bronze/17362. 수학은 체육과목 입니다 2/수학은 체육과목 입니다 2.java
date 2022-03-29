import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // %8이 1~5까진 똑같이 출력, 6일때 4, 7일때 3, 0일때 2
        
		int n = sc.nextInt();
		int result = 0;
		if(n % 8 >= 1 && n % 8 <= 5) result = n % 8;
		else if(n % 8 == 6) result = 4;
		else if(n % 8 == 7) result = 3;
		else if(n % 8 == 0) result = 2;
		System.out.println(result);
	}
}
