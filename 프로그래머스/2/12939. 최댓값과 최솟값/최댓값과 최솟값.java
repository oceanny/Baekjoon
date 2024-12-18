class Solution {
    public String solution(String s) {
        String answer = "";
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            long tmp = Long.parseLong(arr[i]);
            if (tmp > max) max = tmp;
            if (tmp < min) min = tmp;
        }
        
        answer = min + " " + max;
        return answer;
    }
}