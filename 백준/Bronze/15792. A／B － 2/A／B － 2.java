import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int count = 0;
		
		sb.append(A / B).append(".");
		A = (A - A / B * B) * 10;
		
		while (A != 0 && count <= 1000) {
			sb.append(A / B);
			A = (A - A / B * B) * 10;
			count++;
		}
		
		System.out.println(sb);
	}
}