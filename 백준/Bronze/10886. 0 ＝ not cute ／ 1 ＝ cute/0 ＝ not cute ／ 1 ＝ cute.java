import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cute = 0;
		int ncute = 0;
		for (int i = 0; i < T; i++) {
			if (Integer.parseInt(br.readLine()) == 1) cute++;
			else ncute++;
		}
		if (cute > ncute) System.out.print("Junhee is cute!");
		else System.out.print("Junhee is not cute!");
	}
}