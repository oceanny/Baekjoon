import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
		int[] answer = new int[N];
		double[] challenge = new double[N + 1];
		double[] fail = new double[N + 1];
		for (int i = 0; i < stages.length; i++) {
			if (stages[i] <= N)	fail[stages[i]]++;
			for (int j = 1; j <= N; j++) {
				if (stages[i] >= j) challenge[j]++;
			}
		}
		for (int i = 1; i <= N; i++) {
			if (fail[i] == 0 || challenge[i] == 0) map.put(i, 0.0);
			else map.put(i, (double)fail[i] / challenge[i]);
		}
		
		List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int ans = map.get(o2).compareTo(map.get(o1));
				if (ans == 0) {
					if (o1 > o2) ans = 1;
					else ans = -1;
				}
				return ans;
			}
        	
        });
        int i = 0;
        for (int key : keySet) {
        	answer[i] = key;
        	i++;
        }
        
		return answer;
    }
}