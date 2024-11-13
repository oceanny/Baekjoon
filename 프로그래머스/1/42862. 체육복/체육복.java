import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int[] students = new int[n + 2];
        
        for (int i = 0; i < reserve.length; i++) {
        	students[reserve[i]] = 1;
        }
        
        for (int i = 0; i < lost.length; i++) {
        	students[lost[i]] -= 1;
        }
        
        for (int i = 0; i < reserve.length; i++) {
        	if (students[reserve[i]] == 0) continue;
        	if (students[reserve[i] - 1] == -1) {
        		students[reserve[i] - 1] = 0;
        		students[reserve[i]] = 0;
                continue;
        	}
        	if (students[reserve[i] + 1] == -1) {
        		students[reserve[i] + 1] = 0;
        		students[reserve[i]] = 0;
        	}
        }
        
        for (int i = 1; i <= n; i++) {
        	if (students[i] >= 0) answer++;
        }
        
        return answer;
    }
}