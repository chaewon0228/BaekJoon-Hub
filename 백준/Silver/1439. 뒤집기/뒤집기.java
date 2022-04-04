import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split("");
		int zero = 0, one = 0;
		
		if(str[0].equals("1")) one++;
		else zero++;
		for(int i=1; i<str.length; i++) {
			if(!str[i].equals(str[i-1])) {
				if(str[i].equals("1")) one++;
				else zero++;
			}
		}
		System.out.println(Math.min(zero, one));
	}
}