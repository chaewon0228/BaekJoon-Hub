import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] seat = new int[4];
        
        for(int i=0; i<4; i++){
            seat[i] = sc.nextInt();
        }
        System.out.println(seat[0] * seat[1] + seat[2] * seat[3]);
        
    }
}