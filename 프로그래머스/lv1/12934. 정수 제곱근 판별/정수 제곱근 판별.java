class Solution {
    public long solution(long n) {
        long answer = 0;
        double temp = Math.sqrt(n);
        
        if (temp * 10 % 10 == 0) answer = (long)Math.pow(temp + 1, 2);
        else answer = -1;
        
        return answer;
    }
}