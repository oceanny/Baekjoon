import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		sc.close();
		double M = (B - A) / 400;
		double win = 1 / (1 + Math.pow(10, M));
		System.out.printf("%f", win);
	}
}