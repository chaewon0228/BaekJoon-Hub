import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//91은 앞자리 9780921418948을 계산한 결과값이다.
		System.out.println("The 1-3-sum is " + (91 + a + b*3 + c));
		sc.close();
	}
}
