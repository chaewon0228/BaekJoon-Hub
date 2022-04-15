import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		String result = "";
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
		boolean chk = true;
		for(int i=0; i<str[0].length(); i++) {
			chk = true;
			for(int j=1; j<n; j++) {
				if(str[0].charAt(i) != str[j].charAt(i)) {
					chk = false;
				}
			}
			if(chk) result += str[0].charAt(i);
			else result += '?';
		}
		System.out.println(result);
	}
}