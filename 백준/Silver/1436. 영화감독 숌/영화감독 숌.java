import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        while(n > 0){
            cnt++;
            if(String.valueOf(cnt).contains("666")) n--;
        }
        System.out.println(cnt);
    }
}