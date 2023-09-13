import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double val = Double.parseDouble(st.nextToken());
			String unit = st.nextToken();
			double result = 0.0;
			switch (unit) {
			case "kg":
				result = val * 2.2046;
				unit = "lb";
				break;
			case "lb":
				result = val * 0.4536;
				unit = "kg";
				break;
			case "l":
				result = val * 0.2642;
				unit = "g";
				break;
			case "g":
				result = val * 3.7854;
				unit = "l";
				break;
			}
			System.out.printf("%.4f %s\n", result, unit);
		}
	}
}