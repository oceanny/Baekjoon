import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int sum = 10; // 바닥에서 시작해서 true
		char start = str.charAt(0);
		
		for (int i = 1; i < str.length(); i++) {
			if (start == str.charAt(i)) sum += 5;
			else sum += 10;
			start = str.charAt(i);
		}
		System.out.println(sum);
	}
}