import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sec, total = 0;
        
        for(int i=0; i<4; i++){
            sec = sc.nextInt();
            total += sec;
        }
        int hour = (int)(total / 60);
        int minute = total - (hour * 60);
        
        System.out.println(hour);
        System.out.println(minute);
    }
}