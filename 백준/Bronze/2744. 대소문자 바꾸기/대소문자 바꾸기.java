import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = "";
		sc.close();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 91) ans += str.substring(i, i + 1).toLowerCase();
			else if (str.charAt(i) > 96) ans += str.substring(i, i + 1).toUpperCase();
		}
		
		System.out.println(ans);
	}
}
