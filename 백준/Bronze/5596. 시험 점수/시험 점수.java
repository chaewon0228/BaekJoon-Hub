import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int s = 0, t = 0;
		for(int i=0; i<8; i++) {
			if(i<4) s += sc.nextInt();
			else t += sc.nextInt();
		}
		System.out.println(s > t ? s : (s == t ? s : t));
    }
}