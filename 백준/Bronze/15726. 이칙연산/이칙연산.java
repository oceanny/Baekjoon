import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		sc.close();
		double D = A * B / C;
		double E = A / B * C;
		System.out.println((int)Math.max(D, E));
	}
}