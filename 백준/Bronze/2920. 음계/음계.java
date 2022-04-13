import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		String result = "";
		for(int i=0; i<num.length - 1; i++) {
			if(num[i] == num[i + 1] - 1) result = "ascending";
			else if(num[i] == num[i + 1] + 1) result = "descending";
			else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
}