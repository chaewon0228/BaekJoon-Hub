import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();
        long r = 0;
        
        // 자릿수를 하나씩 늘려가면서 연산해야 함
        for (int i=0; i<num.length(); i++) {
        	r = (r * 10 + (num.charAt(i) - '0')) % 20000303;
        }
        System.out.println(r);
        
        // 시간 초과 코드
        /* BigInteger b = sc.nextBigInteger();
        System.out.println(b.divide(new BigInteger("20000303")));*/
    }
}