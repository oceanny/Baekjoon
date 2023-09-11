import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int U = sc.nextInt();
		int L = sc.nextInt();
		sc.close();
		boolean prob = N >= 1000;
		boolean level = U >= 8000 || L >= 260;
		if (prob && level) System.out.print("Very Good");
		else if (prob && !level) System.out.print("Good");
		else System.out.print("Bad");
	}
}