import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	    int t = sc.nextInt();
	    int c = sc.nextInt();
	    int p = sc.nextInt();
	    int harvest = -1;

	    for(int i=1; i<=n; i+=t) {
	    	harvest++;
	    }
		System.out.println((c * harvest) * p);
    }
}