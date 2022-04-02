import java.util.Scanner;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i=0; i<n; i++) {
			hash.add(sc.nextInt());
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(hash);
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
