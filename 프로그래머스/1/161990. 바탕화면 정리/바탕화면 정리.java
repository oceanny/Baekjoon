class Solution {
    public int[] solution(String[] wallpaper) {
        int min_y = Integer.MAX_VALUE;
        int min_x = Integer.MAX_VALUE;
        int max_y = Integer.MIN_VALUE;
        int max_x = Integer.MIN_VALUE;
        
        for (int i = 0; i < wallpaper.length; i++) {
        	String tmp = wallpaper[i];
        	
        	for (int j = 0; j < tmp.length(); j++) {
        		if (tmp.charAt(j) == '#') {
        			if (min_y > i) min_y = i;
        			if (min_x > j) min_x = j;
        			if (max_y < i + 1) max_y = i + 1;
        			if (max_x < j + 1) max_x = j + 1;
        		}
        	}
        }
        
        int[] answer = {min_y, min_x, max_y, max_x};
        return answer;
    }
}