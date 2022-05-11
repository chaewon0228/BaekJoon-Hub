import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0; // 0의 개수를 카운트하는 변수
		
        // 소인수분해를 하면 2와 5가 나오는데, 2와 5가 한쌍을 이뤄야 10이 되므로 0의 개수를 알 수 있다.
        // 2의 개수가 5의 개수보다 더 많기 때문에 5로 나누어 누적한다.
		while(num >= 5) {
			cnt  += num / 5;
			num /= 5;
		}
		System.out.println(cnt);
	}
}