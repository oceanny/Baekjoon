class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            int hours = schedules[i] / 100;
            int minutes = schedules[i] % 100 + 10;
            if (minutes >= 60) {
                hours++;
                minutes -= 60;
            }
            int target = hours * 100 + minutes;
            
            for (int j = 0; j < 7; j++) {
                if (timelogs[i][j] > target && ((((j + startday) % 7) < 6)) && (((j + startday) % 7) > 0))
                    break;
                if (j == 6)
                    answer++;
            }
        }
        
        return answer;
    }
}