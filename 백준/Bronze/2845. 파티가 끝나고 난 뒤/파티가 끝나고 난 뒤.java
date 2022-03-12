import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int num, people = a*b;
        for(int i=0; i<5; i++){
            num = sc.nextInt();
            System.out.print(num-people + " ");
        }
        
    }
}