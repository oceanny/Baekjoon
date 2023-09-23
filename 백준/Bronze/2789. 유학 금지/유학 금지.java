import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(check(str.charAt(i)));
		}
		System.out.println(sb);
	}

	private static String check(char ch) {
		String str = "CAMBRIDGE";
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) return "";
		}
		return Character.toString(ch);
	}
}