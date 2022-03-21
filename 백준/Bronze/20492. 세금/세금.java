import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int case1 = (int)(n * 0.78);
		int case2 = (int)((n * 0.8) + (n * 0.2 * 0.78));
		System.out.println(case1 + " " + case2);
		sc.close();
	}
}