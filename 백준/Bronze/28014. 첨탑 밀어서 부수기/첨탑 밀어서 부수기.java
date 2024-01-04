import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int count = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int front = Integer.parseInt(st.nextToken());
		while (st.hasMoreTokens()) {
			int back = Integer.parseInt(st.nextToken());
			if (back >= front) count++;
			front = back;
		}
		System.out.println(count);
	}
}