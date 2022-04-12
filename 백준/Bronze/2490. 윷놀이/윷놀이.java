import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[3];
		String result = "";
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				sum[i] += sc.nextInt();
			}
		}
		for(int i=0; i<3; i++) {
			switch(sum[i]) {
				case 0: result="D"; break;
				case 1: result="C"; break;
				case 2: result="B"; break;
				case 3: result="A"; break;
				default: result="E"; 
			}
			System.out.println(result);
		}
	}
}