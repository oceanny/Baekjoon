import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		
		// 하얀 칸을 true로 설정
		boolean[][] chess = new boolean[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) chess[i][j] = true;
					else chess[i][j] = false;
				}
				else {
					if (j % 2 == 0) chess[i][j] = false;
					else chess[i][j] = true;
				}
			}
		}
		
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			// 체스판의 상태를 저장할 배열
			char[] charArr = str.toCharArray();
			for (int j = 0; j < 8; j++) {
				if (chess[i][j] & charArr[j] == '.') chess[i][j] = false;
				if (chess[i][j]) ans++;
			}
		}
		
		System.out.println(ans);
	}
}
