import java.util.Scanner;
public class Main{
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         String st = sc.next();
         sc.close();
         System.out.println(Integer.parseInt(st, 16));
     }
}