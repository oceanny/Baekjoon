import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] count = new int[4][4];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 3; j++) {
				int temp = Integer.parseInt(st.nextToken());
				count[j][0] += temp;
				count[j][temp]++;
			}
		}
		int max = 0;
		int index = -1;
		for (int i = 1; i <= 3; i++) {
			if (count[i][0] > max) {
				max = count[i][0];
				index = i;
			}
			else if (count[i][0] == max) {
				if (count[i][3] > count[index][3]) index = i;
				else if (count[index][3] > count[i][3]) continue;
				else if (count[i][3] == count[index][3]) {
					if (count[i][2] > count[index][2]) index = i;
					else if (count[i][2] == count[index][2]) {
						if (i != 3 && count[3][0] >= max) continue;
						else index = 0;
					}
				}
			}
		}
		System.out.printf("%d %d", index, max);
	}
}