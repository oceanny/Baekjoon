import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int tmp = elements[j];
                for (int k = 1; k <= i; k++) {
                    int idx = j + k;
                    if (idx >= elements.length) idx %= elements.length;
                    tmp += elements[idx];
                }
                set.add(tmp);
            }
        }

        answer = set.size();
        return answer;
    }
}