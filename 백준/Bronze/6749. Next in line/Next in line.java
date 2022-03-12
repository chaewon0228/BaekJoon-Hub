import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        System.out.println(m + (m - y));
    }
}