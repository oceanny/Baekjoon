import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double D  = sc.nextDouble();
		double H = sc.nextDouble();
		double W = sc.nextDouble();
		sc.close();
		double temp = Math.pow(D, 2) / (Math.pow(W, 2) + Math.pow(H, 2));
		double eff = Math.sqrt(temp);
		int Y = (int) (eff * H);
		int X = (int) (eff * W);
		System.out.printf("%d %d", Y, X);
	}
}