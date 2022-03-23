import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		
		int result;
		w -= k;
		if(w <= 0) result = 0;
		else {
			result = w / m;
			if(w % m != 0) result++;
		}
		System.out.println(result);
		sc.close();
	}
}
