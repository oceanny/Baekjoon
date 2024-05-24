import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int[] A = new int[5];
			int[] B = new int[5];

			StringTokenizer st = new StringTokenizer(br.readLine());
			int len_A = Integer.parseInt(st.nextToken());
			for (int j = 0; j < len_A; j++) {
				A[Integer.parseInt(st.nextToken())]++;
			}

			st = new StringTokenizer(br.readLine());
			int len_B = Integer.parseInt(st.nextToken());
			for (int j = 0; j < len_B; j++) {
				B[Integer.parseInt(st.nextToken())]++;
			}

			int check = 0;
			for (int j = 4; j > 0; j--) {
				if (Integer.compare(A[j], B[j]) != 0) {
					check = Integer.compare(A[j], B[j]);
					break;
				}
			}

			switch (check) {
			case 1:
				System.out.println("A");
				break;
			case 0:
				System.out.println("D");
				break;
			case -1:
				System.out.println("B");
				break;
			}
		}
	}
}