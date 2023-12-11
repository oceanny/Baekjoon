import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] face = new String[N];
		for (int i = 0; i < N; i++) {
			face[i] = br.readLine();
		}
		int K = Integer.parseInt(br.readLine());
		switch (K) {
		case 1:
			break;
		case 2:
			for (int i = 0; i < N; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = N; j >= 1; j--) {
					sb.append(face[i].substring(j - 1, j));
				}
				face[i] = sb.toString();
			}
			break;
		case 3:
			for (int i = 0; i < N / 2; i++) {
				String temp = face[i];
				face[i] = face[N - i - 1];
				face[N - i - 1] = temp;
			}
			break;
		}
		for (int i = 0; i < N; i++) {
			System.out.println(face[i]);
		}
	}
}