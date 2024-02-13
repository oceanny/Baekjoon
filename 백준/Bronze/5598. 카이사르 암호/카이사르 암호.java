import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String caesar = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < caesar.length(); i++) {
			if (caesar.charAt(i) == 'A') sb.append('X');
			else if (caesar.charAt(i) == 'B') sb.append('Y');
			else if (caesar.charAt(i) == 'C') sb.append('Z');
			else sb.append((char) (caesar.charAt(i) - 3));
		}
		System.out.println(sb);
	}
}