import java.util.*;
 public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long a= sc.nextInt();
            long b= sc.nextInt();
            long c= sc.nextInt();
            long result;
        
            if(c-b<=0) {
                result=-1;
            }else{
                result=(a/(c-b))+1;
            }
    System.out.println(result);
    sc.close();
   }                
}