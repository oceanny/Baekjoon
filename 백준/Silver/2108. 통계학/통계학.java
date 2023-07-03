import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int med;
		int mode = 0;
		int range;
		
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			list.add(temp);
			sum += temp;
		}
		
		sum = (int)Math.round((double)sum / n);
		Collections.sort(list);
		range = Collections.max(list) - Collections.min(list);
		med = list.get(n / 2);
		
//		중복 비허용인 map을 이용해 key에는 수를, value에는 빈도를 저장
		for (int i : list) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
//		최빈값 추출
		for (int value : map.values()) {
			mode = Math.max(mode, value);
		}
		
//		list를 clear하고 최빈값과 value가 같은 key를 list에 다시 저장
		list.clear();
		for (int key : map.keySet()) {
			if (map.get(key) == mode) list.add(key);
		}
		
		Collections.sort(list);
		if (list.size() >= 2) mode = list.get(1);
		else mode = list.get(0);
		
		System.out.printf("%d\n%d\n%d\n%d", sum, med, mode, range);
	}
}
