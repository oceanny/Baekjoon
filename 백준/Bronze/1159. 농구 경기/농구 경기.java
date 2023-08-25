import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] alphabet = new int[26];
		for (int i = 0; i < N; i++) {
			char text = br.readLine().charAt(0);
			alphabet[text - 'a']++;
		}
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] >= 5) {
				char temp = (char)(i + 'a');
				sb.append(temp);
			}
		}
		if (sb.length() < 1) sb.append("PREDAJA");
		System.out.println(sb);
	}
}
