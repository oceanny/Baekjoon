import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		sc.close();
		double euclid = Math.PI * Math.pow(R, 2);
		double taxi = Math.pow(R, 2) * 2;
		System.out.println(euclid);
		System.out.println(taxi);
	}
}