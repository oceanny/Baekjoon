import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		sc.close();
		int X = m;
		int n = 0;
		int time = 0;
		while (n < N) {
			if (X + T <= M) {
				X += T;
				n++;
			}
			else if (m + T > M) {
				System.out.println(-1);
				return;
			} 
			else {
				X = X - R < m ? m : X - R;
			}
			time++;
		}
		System.out.println(time);
	}
}