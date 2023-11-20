import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == 'S') {
					System.out.println(name);
					return;
				}
			}
		}
	}
}