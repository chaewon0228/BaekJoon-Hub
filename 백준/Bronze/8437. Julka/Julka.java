import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger sum = new BigInteger(buf.readLine());
        BigInteger diff = new BigInteger(buf.readLine());
        
        // (10-2)/2 + 2 = 6
        BigInteger first = (sum.subtract(diff)).divide(BigInteger.valueOf(2)).add(diff);
        // (10-2)/2     = 4
        BigInteger second = (sum.subtract(diff)).divide(BigInteger.valueOf(2)); 
        
        System.out.println(first);
        System.out.println(second);
        
        /* -처음에 생각한 코드-
        // int로 처리 : 처리하는 숫자가 작을 경우
        int first = 0, second = 0;
        
	    for(int i=1; i<=sum/2; i++){
            first = sum - i;
            second = sum - first;
            if((Math.abs(first - second)) == diff){
                System.out.println(first);
                System.out.println(second);
                break;
            }
        }
        */
    }
}