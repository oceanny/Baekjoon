class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int left = 10;
        int right = 12;
        
        for (int i = 0; i < numbers.length; i++) {
        	if (numbers[i] == 0) numbers[i] = 11;
        	if (numbers[i] % 3 == 1) {
        		sb.append("L");
        		left = numbers[i];
        	}
        	else if (numbers[i] % 3 == 0) {
        		sb.append("R");
        		right = numbers[i];
        	}
        	else {
        		int lx = left / 3;
        		int ly = left % 3 - 1;
        		
        		int rx = right % 3 == 0 ? right / 3 - 1 : right / 3;
        		int ry = right % 3 == 0 ? 2 : 1;
        		
        		int tx = numbers[i] / 3;
        		int ty = numbers[i] % 3 - 1;
        		
        		int diff_l = Math.abs(tx - lx) + Math.abs(ty - ly);
        		int diff_r = Math.abs(tx - rx) + Math.abs(ty - ry);
        		
        		if (diff_l == diff_r) {
        			if (hand.equals("right")) {
        				sb.append("R");
        				right = numbers[i];
        			}
        			else {
        				sb.append("L");
        				left = numbers[i];
        			}
        		}
        		else if (diff_l > diff_r) {
        			sb.append("R");
    				right = numbers[i];
        		}
        		else {
    				sb.append("L");
    				left = numbers[i];
        		}
        	}
        }
        
        answer = sb.toString();
        return answer;
    }
}