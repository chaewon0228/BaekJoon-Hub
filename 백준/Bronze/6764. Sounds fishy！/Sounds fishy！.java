import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String result = "";
        
		if(a > b && b > c && c > d) result = "Fish Diving";
		else if(a < b && b < c && c < d) result = "Fish Rising";
		else if(a == b && b == c && c == d) result = "Fish At Constant Depth";
		else result = "No Fish";
		
		System.out.println(result);
		sc.close();
	}
}
