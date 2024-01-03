import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
		
		// Arrays.sort() 보다 Collections.sort()의 시간 복잡도가 양호하므로 list로 풀이
		List<String> x = new ArrayList<>(Arrays.asList(X.split("")));
		List<String> y = new ArrayList<>(Arrays.asList(Y.split("")));
		List<Integer> partner = new ArrayList<>();
		
		Collections.sort(x);
		Collections.sort(y);
		
		int[] countX = new int[10];
		int[] countY = new int[10];
		int count = 0;
		int value = 0;
		
		for (int i = 0; i < x.size(); i++) {
			if (Integer.parseInt(x.get(i)) != value) {
				countX[value] = i - count;
				count = i;
				value = Integer.parseInt(x.get(i));
			}
			if (i == x.size() - 1) {
				countX[value] = i - count + 1;
			}
		}
		
		count = 0;
		value = 0;
		
		for (int i = 0; i < y.size(); i++) {
			if (Integer.parseInt(y.get(i)) != value) {
				countY[value] = i - count;
				count = i;
				value = Integer.parseInt(y.get(i));
			}
			if (i == y.size() - 1) {
				countY[value] = i - count + 1;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < Math.min(countX[i], countY[i]); j++) {
				partner.add(i);
			}
		}
		
		if (partner.size() == 0) answer = "-1";
		else {
			Collections.sort(partner);
			StringBuilder sb = new StringBuilder();
			for (int i = partner.size() - 1; i >= 0; i--) {
				if (partner.get(partner.size() - 1).equals(0)) {
					sb.append("0");
					break;
				}
				sb.append(partner.get(i));
			}
			answer = sb.toString();
		}
		
		return answer;
    }
}