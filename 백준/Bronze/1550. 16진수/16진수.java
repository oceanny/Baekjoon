import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hexa = sc.nextLine();
		sc.close();
		int decimal = 0;
		for (int i = 0; i < hexa.length() ; i++) {
			decimal += decimal(hexa.charAt(i)) * Math.pow(16, hexa.length() - i - 1);
		}
		System.out.println(decimal);
	}

	private static int decimal(char hexa) {
		switch (hexa) {
		case 'A':return 10;
		case 'B':return 11;
		case 'C':return 12;
		case 'D':return 13;
		case 'E':return 14;
		case 'F':return 15;
		default:return hexa - '0';
		}
	}
}