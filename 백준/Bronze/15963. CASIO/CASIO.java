import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String M = sc.next();
		sc.close();
		
		if (N.equals(M)) System.out.print(1);
		else System.out.print(0);
	}
}