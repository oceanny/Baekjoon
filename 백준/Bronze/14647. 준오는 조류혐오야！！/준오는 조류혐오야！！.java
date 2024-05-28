import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[][] arr = new String[n][m];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = st.nextToken();
				if (arr[i][j].contains("9")) {
					for (int k = 0; k < arr[i][j].length(); k++) {
						if (arr[i][j].charAt(k) == '9')
							count++;
					}
				}
					
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			int check = 0;
			for (int j = 0; j < m; j++) {
				if (arr[i][j].contains("9")) {
					for (int k = 0; k < arr[i][j].length(); k++) {
						if (arr[i][j].charAt(k) == '9')
							check++;
					}
				}
			}
			if (check > max)
				max = check;
		}
		
		for (int i = 0; i < m; i++) {
			int check = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j][i].contains("9")) {
					for (int k = 0; k < arr[j][i].length(); k++) {
						if (arr[j][i].charAt(k) == '9')
							check++;
					}
				}
			}
			if (check > max)
				max = check;
		}
		
		System.out.println(count - max);
	}
}