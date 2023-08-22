import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int ans = 0;
        // +와 -를 인식하지 못하므로 대괄호를 입력함
		String[] minus = str.split("[-]");
		for (int i = 0; i < minus.length; i++) {
			int temp = mySum(minus[i]);
			if (i == 0) ans += temp;
			else ans -= temp;
		}
		System.out.println(ans);
	}
	private static int mySum(String str) {
		int sum = 0;
		String[] plus = str.split("[+]");
		for (int i = 0; i < plus.length; i++) {
			sum += Integer.parseInt(plus[i]);
		}
		return sum;
	}
}