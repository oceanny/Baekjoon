class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
        	ch[i] = s.charAt(i);
        	
        	if ((ch[i] > 64 && ch[i] < 91)) {
        		ch[i] += n;
        		if (ch[i] > 90) {
        			String temp =  "" + (char)(ch[i] + 6);
        			temp = temp.toUpperCase();
        			ch[i] = temp.charAt(0);
        		} 
        	}
        		
        	if ((ch[i] > 96 && ch[i] < 123)) {
        		ch[i] += n;
        		if (ch[i] > 122) {
        			String temp =  "" + (char)(ch[i] - 26);
        			ch[i] = temp.charAt(0);
        		}
        	}
        	
        	answer += ch[i];
        }
        return answer;
    }
}