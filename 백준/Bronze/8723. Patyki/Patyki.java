import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] len = new int[3];
		int result = 0;
		
		for(int i=0; i<3; i++) {
			len[i] = sc.nextInt();
		}
		Arrays.sort(len);
		
		if(len[0] == len[1] && len[1] == len[2] && len[0] == len[2]) result = 2;
		else if(Math.pow(len[2], 2) == len[1]*len[1] + len[0]*len[0]) result = 1;
		else result = 0;
		
		System.out.println(result);
		sc.close();
	}
}
