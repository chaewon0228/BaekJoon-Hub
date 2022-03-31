import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine(); 
		int[] num = new int[10];
		int cnt = 0;
		
		n = n.replace('6', '9');
		for(int i=0; i<n.length(); i++) {
			num[n.charAt(i) - '0']++;
		}
		num[9] = (num[9] + 1) / 2;
		Arrays.sort(num);
        // 가장 큰 수 출력(최대 세트 수)
		System.out.println(num[9]); 
	}
}