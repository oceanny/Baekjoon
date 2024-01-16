import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int p = Integer.parseInt(br.readLine());
			long money = Long.MIN_VALUE;
			String name = "";
			for (int j = 0; j < p; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				long temp_money = Long.parseLong(st.nextToken());
				String temp_name = st.nextToken();
				if (money < temp_money) {
					money = temp_money;
					name = temp_name;
				}
			}
			System.out.println(name);
		}
	}
}