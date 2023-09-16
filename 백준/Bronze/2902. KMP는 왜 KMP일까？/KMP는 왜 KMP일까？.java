import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("-");
		sc.close();
		String ans = "";
		for (int i = 0; i < input.length; i++) {
			ans += input[i].charAt(0);
		}
		System.out.println(ans);
	}
}
