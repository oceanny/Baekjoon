import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<String, String> map = new HashMap<>();
		
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		for (int i = 1; i <= n; i++) {
			String name = br.readLine();
			String num = Integer.toString(i);
			map.put(name,  num);
			map.put(num, name);
		}
		
		for (int i = 0; i < m; i++) {
			sb.append(map.get(br.readLine())).append('\n');
		}
		
		System.out.println(sb);
		
	}
}
