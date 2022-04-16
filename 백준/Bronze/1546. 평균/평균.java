import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int score;
        int max= 0;
        int total= 0;
        double average= 0;
        for (int i=0; i<n; ++i){
            score= sc.nextInt();
            total+= score;
            if(score>max){
                max= score;
            }
        }
        average= 100.0 * total/max/n;
        System.out.println(average);
        sc.close();
    }
}