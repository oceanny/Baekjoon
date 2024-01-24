import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabet = new int[26];
		String str = br.readLine();
		while (str != null) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') continue;
				alphabet[str.charAt(i) - 'a']++;
			}
			str = br.readLine();
		}
		int max = 0;
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] > max) max = alphabet[i];
		}
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] == max) System.out.print((char)(i + 'a'));;
		}
	}
}