import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();sc.nextLine();
		String str = sc.nextLine();
		sc.close();
		int A = 0;
		int B = 0;
		for (int i = 0; i < V; i++) {
			switch (str.charAt(i)) {
			case 'A':
				A++;
				break;
			case 'B':
				B++;
				break;
			}
		}
		if (A > B) System.out.println("A");
		else if (B > A) System.out.println("B");
		else System.out.println("Tie");
	}
}