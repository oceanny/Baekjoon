import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Math.pow(str.charAt(i) - '0', 5);
		}
		System.out.println(sum);
	}
}