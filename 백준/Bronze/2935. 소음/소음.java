import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = new BigInteger(sc.nextLine());
		String Operator = sc.nextLine();
		BigInteger B = new BigInteger(sc.nextLine());
		sc.close();
		switch (Operator) {
		case "+":
			System.out.println(A.add(B));
			break;
		case "*":
			System.out.println(A.multiply(B));
			break;
		}
	}
}