import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] date = sc.nextLine().split("-");
		int N = sc.nextInt();
		sc.close();
		int d = Integer.parseInt(date[2]) + N;
		 // -1을 하지 않고 30으로 나누면 d의 값이 0이 될 수 있다
		int m = Integer.parseInt(date[1]) + (d - 1) / 30;
		d = (d - 1) % 30 + 1;
		int y = Integer.parseInt(date[0]) + (m - 1) / 12;
		m = (m - 1) % 12 + 1;
		System.out.printf("%d-%02d-%02d", y, m, d);
	}
}