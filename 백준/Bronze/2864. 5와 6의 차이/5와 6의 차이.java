import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		StringBuilder maxA = new StringBuilder();
		StringBuilder maxB = new StringBuilder();
		StringBuilder minA = new StringBuilder();
		StringBuilder minB = new StringBuilder();
		int max = 0;
		int min = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '5') {
				maxA.append('6');
				minA.append(A.charAt(i));
			}
			else if (A.charAt(i) == '6') {
				minA.append('5');
				maxA.append(A.charAt(i));
			}
			else {
				maxA.append(A.charAt(i));
				minA.append(A.charAt(i));
			}
		}
		for (int i = 0; i < B.length(); i++) {
			if (B.charAt(i) == '5') {
				maxB.append('6');
				minB.append(B.charAt(i));
			}
			else if (B.charAt(i) == '6') {
				minB.append('5');
				maxB.append(B.charAt(i));
			}
			else {
				maxB.append(B.charAt(i));
				minB.append(B.charAt(i));
			}
		}
		max = Integer.parseInt(maxA.toString()) + Integer.parseInt(maxB.toString());
		min = Integer.parseInt(minA.toString()) + Integer.parseInt(minB.toString());
		System.out.printf("%d %d", min, max);
	}
}