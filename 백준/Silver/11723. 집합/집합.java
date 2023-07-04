import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Integer> s = new HashSet<>();;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String temp = st.nextToken();
			int num;
			
			switch (temp) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				s.add(num);
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				s.remove(num);
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				if (s.contains(num)) sb.append(1 + "\n");
				else sb.append(0 + "\n");
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				if (s.contains(num)) s.remove(num);
				else s.add(num);
				break;
			case "all":
				s.clear();
				for (int j = 1; j <= 20; j++) {
					s.add(j);
				}
				break;
			case "empty":
				s.clear();
				break;
			}
		}
		
		System.out.println(sb);
		
	}
}
