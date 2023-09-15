import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
				ans++;
				break;
			case 'e':
				ans++;
				break;
			case 'i':
				ans++;
				break;
			case 'o':
				ans++;
				break;
			case 'u':
				ans++;
				break;
			default:
				break;
			}
		}
		System.out.println(ans);
	}
}