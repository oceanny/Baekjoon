import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int credit = 0;
		double grade = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int credit_temp = Integer.parseInt(st.nextToken());
			String score = st.nextToken();
			credit += credit_temp;
			grade += Cal(score) * credit_temp;
		}
		System.out.printf("%.02f", grade / credit);
	}

	private static double Cal(String score) {
		switch (score) {
		case "A+": return 4.3;
		case "A0": return 4.0;
		case "A-": return 3.7;
		case "B+": return 3.3;
		case "B0": return 3.0;
		case "B-": return 2.7;
		case "C+": return 2.3;
		case "C0": return 2.0;
		case "C-": return 1.7;
		case "D+": return 1.3;
		case "D0": return 1.0;
		case "D-": return 0.7;
		default: return 0.0;
		}
	}
}