import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		BigInteger ans = new BigInteger("1");
		// 처리
		for (int i = 1; i <= n; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		//출력
		System.out.println(ans);
	}
}

