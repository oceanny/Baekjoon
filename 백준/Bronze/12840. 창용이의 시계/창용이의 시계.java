import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(br.readLine());
		int time = s + m * 60 + h * 3600;
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			int query = Integer.parseInt(st.nextToken());
			int c = 0;
			if (query != 3) c = Integer.parseInt(st.nextToken());
			switch (query) {
			case 1:
				time += c;
				time %= 86400;
				break;
			case 2:
				time -= c;
				time %= 86400;
				if (time < 0) time += 86400;
				break;
			case 3:
				h = time / 3600;
				m = time % 3600 / 60;
				s = time % 60;
				bw.write(h + " " +  m + " " + s + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}