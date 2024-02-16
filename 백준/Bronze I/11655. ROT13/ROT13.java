import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			
			if (S.charAt(i) < 58) sb.append(S.charAt(i));
			else if (S.charAt(i) < 91) {
				if (S.charAt(i) < 78) sb.append((char) (S.charAt(i) + 13));
				else sb.append((char) (S.charAt(i) + 13 - 26));
			}
			else {
				if (S.charAt(i) < 110) sb.append((char) (S.charAt(i) + 13));
				else sb.append((char) (S.charAt(i) + 13 - 26));
			}
		}
		System.out.println(sb.toString());
	}

}