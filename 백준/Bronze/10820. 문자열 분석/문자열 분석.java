import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null){
			int[] arr = new int[4];
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') arr[3]++;
				else if (str.charAt(i) < 58) arr[2]++;
				else if (str.charAt(i) < 91) arr[1]++;
				else arr[0]++;
			}
			System.out.printf("%d %d %d %d\n", arr[0], arr[1], arr[2], arr[3]);
			str = br.readLine();
		}
	}
}