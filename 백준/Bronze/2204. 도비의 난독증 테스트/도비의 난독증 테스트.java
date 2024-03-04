import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long[] f = new long[91];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n != 0) {
			String[] arr = new String[n];
			for (int i = 0; i < n; i++) {
				arr[i] = br.readLine();
			}
			int index = 0;
			for (int i = 1; i < n; i++) {
				String temp = arr[index].toLowerCase();
				String temp2 = arr[i].toLowerCase();
				int result = comp(temp, temp2, 0);
				index = result == 1 ? i : index;
			}
			System.out.println(arr[index]);
			n = Integer.parseInt(br.readLine());
		}
 	}
	private static int comp(String temp, String temp2, int i) {
		try {
			if (temp.charAt(i) > temp2.charAt(i))
				return 1;
			else if (temp.charAt(i) < temp2.charAt(i))
				return 0;
			return comp(temp, temp2, i + 1);
		} catch (Exception e) {
			if (temp.length() > temp2.length()) return 1;
			else return 0;
		}
	}
}