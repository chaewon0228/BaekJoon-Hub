import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) {
			int start_h = sc.nextInt(), start_m = sc.nextInt(), start_s = sc.nextInt();
            int end_h = sc.nextInt(), end_m = sc.nextInt(), end_s = sc.nextInt();
            int start = (start_h * 3600) + (start_m * 60) + start_s;
            int end = (end_h * 3600) + (end_m * 60) + end_s;
            
            int time = end - start;
            int h = time / 3600;
            int m = (time % 3600) / 60;
            int s = (time % 3600) % 60;
            System.out.println(h + " " + m + " " + s);
        }
    }
}