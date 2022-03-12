import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};
        
        for(int i=0; i<6; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<chess.length; i++){
            System.out.print(chess[i] - num[i] + " ");
        }
        sc.close();
    }
}