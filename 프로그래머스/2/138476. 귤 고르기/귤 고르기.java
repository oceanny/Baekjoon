import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int j : tangerine) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        List<Integer> key = new ArrayList<>(map.keySet());

        key.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        for (int c : key) {
            k -= map.get(c);
            answer++;
            if (k <= 0) break;
        }

        return answer;
    }
}