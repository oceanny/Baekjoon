import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		
		System.out.println(2 * s - r1);
	}
}
