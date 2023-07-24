import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(true) {
			String name = st.nextToken();
			if (name.equals("#")) break;
			int age = Integer.parseInt(st.nextToken());
			int kg = Integer.parseInt(st.nextToken());
			
			sb.append(name).append(' ');
			if (age > 17 || kg >= 80) sb.append("Senior").append('\n');
			else sb.append("Junior").append('\n');
			
			st = new StringTokenizer(br.readLine());
		}
		
		System.out.println(sb);
	}
}
