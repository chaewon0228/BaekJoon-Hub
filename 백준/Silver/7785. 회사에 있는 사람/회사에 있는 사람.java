import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String name, work;
		HashMap<String, String> company = new HashMap<String, String>();
		
		for(int i=0; i<n; i++) {
			name = sc.next();
			work = sc.next();
			if(company.containsKey(name)) {
				company.remove(name);
			}
			else {
				company.put(name,  work);
			}
		}
		ArrayList<String> list = new ArrayList<String>(company.keySet());
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}