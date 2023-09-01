import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.printf(":fan::fan::fan:\n:fan::%s::fan:\n:fan::fan::fan:", str);
	}
}