import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float W = sc.nextFloat();
		float H = sc.nextFloat();
		sc.close();
		System.out.printf("%.1f", W * H / 2);
	}
}