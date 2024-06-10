import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		Test: for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			String B = st.nextToken();
			
			if (A.length() == B.length()) {
				char[] As = A.toCharArray();
				char[] Bs = B.toCharArray();
				
				Arrays.sort(As);
				Arrays.sort(Bs);
				
				for (int j = 0; j < As.length; j++) {
					if (As[j] != Bs[j])
						break;
					if (j == As.length - 1) {
						System.out.printf("%s & %s are anagrams.\n", A, B);
						continue Test;
					}
				}
			}

			System.out.printf("%s & %s are NOT anagrams.\n", A, B);
		}
	}
}