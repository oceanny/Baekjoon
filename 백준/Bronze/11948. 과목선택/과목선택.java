import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] science = new int[4];
		int ans = 0;
		int min = 100;
		for (int i = 0; i < 4; i++) {
			science[i] = Integer.parseInt(br.readLine());
			if (science[i] < min) min = science[i];
			ans += science[i];
		}
		int E = Integer.parseInt(br.readLine()); // 역사
		int F = Integer.parseInt(br.readLine()); // 지리
		br.close();
		ans = ans + Math.max(E, F) - min;
		System.out.println(ans);
	}
}