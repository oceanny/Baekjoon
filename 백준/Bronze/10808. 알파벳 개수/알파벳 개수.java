import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int[] alphabet = new int[26];
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			alphabet[arr[i] - 'a']++;
		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.printf("%d ", alphabet[i]);
		}
	}
}
