import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        // Arrays.sort()는 최악의 경우 시간복잡도가 O(n^2)
        Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
	
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);

		for(int value : list) {
			sb.append(value).append("\n");
		}
		System.out.println(sb);
    }
}