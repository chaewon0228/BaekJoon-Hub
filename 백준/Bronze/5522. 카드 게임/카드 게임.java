import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score, sum = 0;
        
        for(int i=0; i<5; i++){
            score = sc.nextInt();
            sum += score;
        }
        System.out.println(sum);
        
    }
}