class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int num = 0;
        
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
        	if (sb.toString().length() > m * t) break;
        	sb.append(Integer.toString(num, n));
        	num++;
        }
        
        String str = sb.toString();
        sb = new StringBuilder();
        for (int i = p - 1; i <= m * (t - 1) + p; i += m) {
        	sb.append(str.charAt(i));
        }
        
        answer = sb.toString().toUpperCase();
        return answer;
    }
}