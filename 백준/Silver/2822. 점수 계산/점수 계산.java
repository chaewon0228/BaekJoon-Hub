import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] score = new int[8][2];
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i=0; i<8; i++) {
			score[i][0] =  Integer.parseInt(br.readLine());
			score[i][1] = i + 1;
		}
		Arrays.sort(score, new Comparator<int[]>() {
			@Override // 내림차순 정렬
			public int compare(int[] arg0, int[] arg1) {
				return arg1[0] - arg0[0];
			}
		});

		for(int i=0; i<5; i++) {
			sum += score[i][0];
			arr[i] = score[i][1];
		}
		Arrays.sort(arr);
		
		bw.write(sum + "\n");
		for(int i=0; i<5; i++) {
			bw.write(arr[i] + " ");
		}
		
		bw.flush();
	}
}