import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		String ans = "";
		int[] day = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;
		
		for (int i = 0; i < x; i++) {
			sum += day[i];
		}
		sum += y;
		
		switch(sum % 7) {
		case 1: ans = "MON"; break;
		case 2: ans = "TUE"; break;
		case 3: ans = "WED"; break;
		case 4: ans = "THU"; break;
		case 5: ans = "FRI"; break;
		case 6: ans = "SAT"; break;
		case 0: ans = "SUN"; break;
		}
		
		System.out.println(ans);
	}
}