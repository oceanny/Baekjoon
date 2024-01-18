import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] X = br.readLine().split("");
			int beauty = 1;
			Arrays.sort(X);
			for (int j = 1; j < X.length; j++) {
				if (!X[j].equals(X[j - 1])) beauty++;
			}
			System.out.println(beauty);
		}
	}
}