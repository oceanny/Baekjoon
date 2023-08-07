import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] time = new int[n];
		int ymoney = 0;
		int mmoney = 0;
		for (int i = 0; i < n; i++) {
			time[i] = Integer.parseInt(st.nextToken());
			ymoney += (time[i] / 30 + 1) * 10;
			mmoney += (time[i] / 60 + 1) * 15;
		}
		
		if (mmoney > ymoney) System.out.printf("%s %d", "Y", ymoney);
		else if (mmoney < ymoney) System.out.printf("%s %d", "M", mmoney);
		else System.out.printf("%s %s %d", "Y", "M", ymoney);
		
	}
}
