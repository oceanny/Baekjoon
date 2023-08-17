import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1000 - sc.nextInt();
		sc.close();
		int ans = 0;
		
		ans += n / 500;
		n = n % 500;
		ans += n / 100;
		n = n % 100;
		ans += n / 50;
		n = n % 50;
		ans += n / 10;
		n = n % 10;
		ans += n / 5;
		n = n % 5;
		ans += n;
		
		System.out.println(ans);
	}
	
}
