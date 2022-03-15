import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();
        sc.close();
        
        int result = (r * 8 + s * 3) - 28;
        System.out.println(result);
    }
}