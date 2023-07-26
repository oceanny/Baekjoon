import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 시
		int b = sc.nextInt(); // 분
		int c = sc.nextInt(); // 초
		int d = sc.nextInt(); // 요리 시간
		
		c = c + d;
		
		if (c >= 60) {
			b = b + c / 60;
			c = c % 60;
		}
		
		if (b >= 60) {
			a = a + b / 60;
			b = b % 60;
		}
		
		if (a > 23) {
			a = a - a / 24 * 24;
			a = a % 24;
		}
		
		System.out.printf("%d %d %d", a, b, c);
	}
}