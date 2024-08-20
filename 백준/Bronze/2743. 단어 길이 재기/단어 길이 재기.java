import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = 0;

		try {
			for (int i = 0; i < 100; i++) {
				str.charAt(i);
				len++;
			}
		} catch (Exception e) {
			System.out.println(len);
            return;
		}
        System.out.println(len);
	}
}