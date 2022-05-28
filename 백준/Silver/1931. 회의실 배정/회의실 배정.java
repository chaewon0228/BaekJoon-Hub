import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		int cnt = 0, eve_end = 0;
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 회의를 종료시간 기준으로 오름차순 정렬
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료시간이 같으면 시작시간이 빠른 순
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		for(int i = 0; i < n; i++) {
            // 전 회의 종료시간이 이번 회의 시작 시간과 겹치지 않을 경우
			if(time[i][0] >= eve_end) {
				eve_end = time[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
