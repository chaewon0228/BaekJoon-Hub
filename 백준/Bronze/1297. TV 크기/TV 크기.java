import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
        double result = Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2));
		System.out.print((int)Math.sqrt(result * Math.pow(h, 2)) + " ");
		System.out.print((int)Math.sqrt(result * Math.pow(w, 2)));
    }
}