import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int range = 2;
		int ans = 1;
		
		if (n == 1) ans = 1;
		
		while(range <= n) {
				range += 6 * count;
				count++;
		}
		
		ans = count;
		
		System.out.println(ans);
	}
}
