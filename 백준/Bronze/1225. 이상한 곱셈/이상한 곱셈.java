import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		long ans = 0;
		
		if (A.equals("0") || B.equals("0")) {
			System.out.println(0);
			return;
		}
		
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < B.length(); j++) {
				ans += Character.getNumericValue(A.charAt(i)) * Character.getNumericValue(B.charAt(j));
				//ans += (A.charAt(i) - '0') * (B.charAt(j) - '0');
			}
		}
		
		System.out.println(ans);
	}
}
