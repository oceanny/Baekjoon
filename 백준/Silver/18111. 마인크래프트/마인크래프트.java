import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner로 입력 시 시간 초과
		StringTokenizer st = new StringTokenizer(br.readLine()); // br.readLine() 후 split 하는 것보다 ST 이용이 효율적
		int n = Integer.parseInt(st.nextToken()); // 세로 길이
		int m = Integer.parseInt(st.nextToken()); // 가로 길이
		int b = Integer.parseInt(st.nextToken()); // 인벤토리에 있는 블록 수
		int[][] arr = new int[n][m];
		int ansTime = Integer.MAX_VALUE;
		int ansHeight = -1;
		int min = 256;
		int max = 0;


		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (max < arr[i][j])
					max = arr[i][j];
				if (min > arr[i][j])
					min = arr[i][j];
			}
		}
		
		for (int i = min; i <= max; i++) {
			// 높이의 범위를 min, max로 제한 후 최소 시간을 찾는다
			int time = 0;
			int inventory = b; // 블록 수를 훼손하지 않기 위해 inventory 선언
			
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					int temp = arr[j][k] - i; // 기준 높이와의 차이
					
					if (temp > 0) time += temp * 2;
					else if (temp < 0) time -= temp;
					// temp가 양수면 블록을 제거해서 인벤토리에 넣으므로 temp를 그대로 더함
					// 음수면 블록을 쌓아야 하므로 temp의 절댓값만큼 인벤토리에서 제거
					// 따라서 구분하지 않아도 됨					
					inventory += temp;
				}
			}
			
			if (inventory >= 0) {
				if (time <= ansTime) {
					ansTime = time;
					ansHeight = i;
				}
			}
		}
		
		System.out.printf("%d %d", ansTime, ansHeight);
		
	}
}
