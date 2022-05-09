import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count= 0;
        if(n<100){
            System.out.println(n);
            return;
        }
        count= 99;
        for(int i=100; i<=n; i++){
            int a= i / 100;
            int b= (i / 10) % 10;
            int c= i % 10;
            
            if(a-b == b-c)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}