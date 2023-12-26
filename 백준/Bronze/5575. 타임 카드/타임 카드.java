import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int gh = Integer.parseInt(st.nextToken());
			int gm = Integer.parseInt(st.nextToken());
			int gs = Integer.parseInt(st.nextToken());
			int lh = Integer.parseInt(st.nextToken());
			int lm = Integer.parseInt(st.nextToken());
			int ls = Integer.parseInt(st.nextToken());
			int go = gh * 3600 + gm * 60 + gs;
			int leave = lh * 3600 + lm * 60 + ls;
			int time = leave - go;
			System.out.printf("%d %d %d\n", time / 3600, time % 3600 / 60, time % 60);
		}
	}
}
