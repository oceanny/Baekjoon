class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean chk = true;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == ' ') {
        		sb.append(" ");
        		chk = true;
        	}
        	else if (chk && s.charAt(i) > 96 && s.charAt(i) < 123) {
        		sb.append(Character.toString(((char) (s.charAt(i) - 32))));
        		chk = false;
        	}
        	else {
        		sb.append(Character.toString(((char) (s.charAt(i)))));
        		chk = false;
        	}
        }
        return sb.toString();
    }
}