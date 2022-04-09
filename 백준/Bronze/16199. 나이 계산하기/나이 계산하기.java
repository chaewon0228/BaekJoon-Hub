import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] date = new int[6];
		
		for(int i=0; i<date.length; i++) {
			date[i] = sc.nextInt();
		}
		int age = date[3] - date[0];
		
		if(date[3] > date[0]) {
			if(date[4] > date[1] || (date[4] == date[1] && date[5] >= date[2])) {
				System.out.println(age);
			}
			else System.out.println(age - 1);
		}
        else System.out.println(age);
        
		System.out.println(age + 1);
		System.out.println(age);
	}
}