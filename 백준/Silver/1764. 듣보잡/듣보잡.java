import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		
		for (int i = 0; i < m; i++) {
			String temp = br.readLine();
			if (set.contains(temp)) {
				list.add(temp);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for (String str : list) {
			System.out.println(str);
		}
		
	}
}
