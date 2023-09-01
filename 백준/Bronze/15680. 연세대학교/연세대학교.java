import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		switch (n) {
		case 0:
			System.out.println("YONSEI");
			break;
		case 1:
			System.out.println("Leading the Way to the Future");
			break;
		}
	}
}
