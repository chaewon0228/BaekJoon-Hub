import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			char as = s.charAt(i);
			if(as >= 'a' && as <= 'z') {
				as += 13;
				if(as > 'z') {
					as = (char) ('a' + (as - ('z' + 1)));
				}
			}
			else if(as >= 'A' && as <= 'Z') {
				as += 13;
				if(as > 'Z') {
					as = (char) ('A' + (as - ('Z' + 1)));
				}
			}
			sb.append(as);
		}
		System.out.println(sb);
	}
}