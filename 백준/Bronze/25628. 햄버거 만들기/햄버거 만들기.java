import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if (A / 2 < B) System.out.print(A / 2);
		else System.out.println(B);
	}
}