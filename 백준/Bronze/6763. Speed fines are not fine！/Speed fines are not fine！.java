import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int speed = sc.nextInt();
		int result = speed - limit;
		
		if(result <= 0) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		else {
			System.out.print("You are speeding and your fine is $");
			if(result >= 1 && result <= 20) result = 100;
			else if(result>= 21 && result <= 30) result = 270;
			else if(result >= 31) result = 500;
			System.out.print(result + ".");
		}
		sc.close();
	}
}
