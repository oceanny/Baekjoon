class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		for (int k = j + 1; k < nums.length; k++) {
        			int temp = nums[i] + nums[j] + nums[k];
        			for (int l = 2; l <= temp / 2; l++) {
        				if (temp % l == 0) break;
        				if (l == temp / 2 && temp % 2 != 0 ) answer++;
        			}
        		}
        	}
        }
        return answer;
    }
}