import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String name = br.readLine();
		int point = 0;
		for (int i = 0; i < N; i++) {
			point += name.charAt(i) - 'A' + 1;
		}
		System.out.println(point);
	}
}