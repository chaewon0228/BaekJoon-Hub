import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0; 
        int count = 0;
        n = sc.nextInt();
        while(true){
            if(n % 5 ==0){
                System.out.println(n/5 + count);
                break;
            }else if(n <= 0) {
                System.out.println(-1);
                break;
            }
            n = n-3;
            count++;
        }
        sc.close();
    }
}