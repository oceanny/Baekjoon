import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	public static int solution(int[] n, int x) {
		int answer = -1;
		
		int lo = 0;
		int hi = n.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (n[mid] == x) {
				answer = 1;
				break;
			}

			else if (n[mid] < x) {
				lo = mid + 1;
			}

			else
				hi = mid - 1;
		}

		return answer;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] narr = new int[n];

		String[] ntemp = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			narr[i] = Integer.parseInt(ntemp[i]);
		}
		
		Arrays.sort(narr);
		
		int m = Integer.parseInt(br.readLine());
		String[] mnum = br.readLine().split(" ");
		
		String[] answer = new String[m];

		for (int i = 0; i < m; i++) {
			if (solution(narr, Integer.parseInt(mnum[i])) >= 0) {
				answer[i] = "1";
			} else
				answer[i] = "0";
		}
		
		for (int i = 0; i < m; i++) {
			bw.write(answer[i]);
			if (i != m - 1) bw.write("\n");
		}

		bw.flush();
	}
}
