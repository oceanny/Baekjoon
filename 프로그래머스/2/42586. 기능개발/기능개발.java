import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] days = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int x = days[0];
        int cnt = 1;
        for (int i = 1; i < days.length; i++) {
            if (x >= days[i]) cnt++;
            else {
                list.add(cnt);
                cnt = 1;
                x = days[i];
            }
        }
        list.add(cnt);
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}