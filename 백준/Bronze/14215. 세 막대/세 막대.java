import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] stick = new int[3];
		for (int i = 0; i < 3; i++) {
			stick[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(stick);
		if (stick[0] + stick[1] <= stick[2]) System.out.println((stick[0] + stick[1]) * 2 - 1);
		else System.out.println(stick[0] + stick[1] + stick[2]);
	}
}