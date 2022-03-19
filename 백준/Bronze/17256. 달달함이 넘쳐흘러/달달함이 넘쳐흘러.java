import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int a_x = sc.nextInt();
        int a_y = sc.nextInt();
        int a_z = sc.nextInt();
        int c_x = sc.nextInt();
        int c_y = sc.nextInt();
        int c_z = sc.nextInt();
        
        System.out.println(c_x - a_z);
        System.out.println(c_y / a_y);
        System.out.println(c_z - a_x);
    }
}