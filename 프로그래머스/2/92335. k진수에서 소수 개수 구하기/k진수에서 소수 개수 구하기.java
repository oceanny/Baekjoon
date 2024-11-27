import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] nums = Integer.toString(n, k).split("0");
        
        a : for (int i = 0; i < nums.length; i++) {
        	if (nums[i].length() == 0) continue;
        	Long number = Long.parseLong(nums[i]);
        	if (number <= 1) continue;
        	for (int j = 2; j <= Math.sqrt(number); j++) {
        		if (number % j == 0) continue a;
        	}
        	answer++;
        }
        return answer;
    }
}