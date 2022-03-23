import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String result = "";

		if (a == 60 && a == b && b == c) result = "Equilateral";
		else if(a+b+c == 180 && (a==b || b==c || c==a)) result = "Isosceles";
		else if(a+b+c == 180) result = "Scalene";
		else result = "Error";
		System.out.println(result);
		sc.close();
	}
}
