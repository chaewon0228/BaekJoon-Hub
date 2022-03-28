import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int cnt = 0, car;
        
		for(int i=0; i<5; i++) {
			car = sc.nextInt();
			if(date == car) cnt++;
		}
		System.out.println(cnt);
	}
}