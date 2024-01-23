import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		if (A == B) {
			bw.write("0");
			bw.flush();
			return;
		}
		if (A > B) {
			long temp = A;
			A = B;
			B = temp;
		}
		bw.write(B - A - 1 + "\n");
		for (long i = A + 1; i < B; i++) {
			bw.write(i + " ");
		}
		bw.flush();
	}
}