import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int a; int b;
		if (str.length() == 3) {
			switch(str.charAt(0) - '0') {
			case 1:
				a = Integer.parseInt(str.substring(0, 2));
				b = Integer.parseInt(str.substring(2));
				break;
			default:
				a = Integer.parseInt(str.substring(0, 1));
				b = Integer.parseInt(str.substring(1));
			}
		}
		else if (str.length() == 4) {
			a = 10;
			b = 10;
		}
		else {
			a = Integer.parseInt(str.substring(0, 1));
			b = Integer.parseInt(str.substring(1));
		}
		System.out.println(a + b);
	}
}