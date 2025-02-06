import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int idx = 0;
        int order = 0;
        
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        char ch = words[0].charAt(words[0].length() - 1);
        
        for (int i = 1; i < words.length; i++) {
            if (ch != words[i].charAt(0) || set.contains(words[i])) {
                if ((i + 1) % n == 0) {
                    idx = n;
                    order = (i + 1) / n;
                }
                else {
                    idx = (i + 1) % n;
                    order = (i + 1) / n + 1;
                }
                break;
            }
            set.add(words[i]);
            ch = words[i].charAt(words[i].length() - 1);
        }

        answer[0] = idx;
        answer[1] = order;
        return answer;
    }
}