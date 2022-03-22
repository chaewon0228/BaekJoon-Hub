import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
        int diff = sc.nextInt();
        
        if(sum < diff){
            System.out.println(-1);
        }
        else{
            int first = (sum - diff) / 2 + diff;
            int second = (sum - diff) / 2;
            if(first+second == sum && first-second == diff){
                 System.out.println(first + " " + second);
            }else{ System.out.println(-1); }
        }
		sc.close();
	}
}