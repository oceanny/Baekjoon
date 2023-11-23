import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int white = 0;
		int black = 0;
		for (int i = 0; i < 8; i++) {
			char[] array = br.readLine().toCharArray();
			for (int j = 0; j < 8; j++) {
				if (array[j] < 91) white += cal(array[j]);
				else black += cal(array[j] - 32);
			}
		}
		System.out.println(white - black);
	}

	private static int cal(int i) {
		switch(i) {
		case 80: return 1;
		case 78: return 3;
		case 66: return 3;
		case 82: return 5;
		case 81: return 9;
		default: return 0;
		}
	}
}