import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        StringTokenizer st = new StringTokenizer(pos, ":");
        int now = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(op_start, ":");
        int opS = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(op_end, ":");
        int opE = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(video_len, ":");
        int len = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < commands.length; i++) {
        	now = check(now, opS, opE, len);
        	switch (commands[i]) {
        	case "prev" : now -= 10; break;
        	case "next" : now += 10; break;
        	}
        }
        
        now = check(now, opS, opE, len);
        
        answer = String.format("%02d", now / 60) + ":" + String.format("%02d", now % 60);
        
        return answer;
    }

	private static int check(int now, int opS, int opE, int len) {
		if (now < 0) now = 0;
		if (now >= opS && now <= opE) now = opE;
        if (now > len) now = len;
		return now;
	}
}