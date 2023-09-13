import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int ax = A % 4 == 0 ? A / 4 : A / 4 + 1;
		int ay = A % 4 == 0 ? 4 : A % 4;
		int bx = B % 4 == 0 ? B / 4 : B / 4 + 1;
		int by = B % 4 == 0 ? 4 : B % 4;
		
		int ans = Math.abs(ax - bx) + Math.abs(ay - by);
		System.out.print(ans);
	}
}