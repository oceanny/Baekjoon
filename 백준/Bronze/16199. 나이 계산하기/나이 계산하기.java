import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 어떤 사람의 생년월일
		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		// 기준 년월일
		int ys = Integer.parseInt(st.nextToken());
		int ms = Integer.parseInt(st.nextToken());
		int ds = Integer.parseInt(st.nextToken());
		int man;
		if (m < ms) man = ys - y;
		else if (m == ms && d <= ds) man = ys - y;
		else man = ys - y - 1;
		int se = ys - y + 1;
		int yeon = ys - y;
		System.out.printf("%d\n%d\n%d", man, se, yeon);
	}
}