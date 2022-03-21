import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int beer, malt, wine, soft_drinks, seltzer, water;
		beer = sc.nextInt();
		malt = sc.nextInt();
		wine = sc.nextInt();
		soft_drinks = sc.nextInt();
		seltzer = sc.nextInt();
		water = sc.nextInt();
        
		int result = beer + malt + wine + soft_drinks + seltzer + water;
		System.out.println(result * 5);
		sc.close();
	}
}