import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        StringTokenizer st;
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < id_list.length; i++) {
        	list.add(id_list[i]);
        }
        
        int[] count = new int[id_list.length];
        boolean[][] reports = new boolean[id_list.length][id_list.length];
        for (int i = 0; i < report.length; i++) {
        	st = new StringTokenizer(report[i]);
        	String user_id = st.nextToken();
        	String report_id = st.nextToken();
        	
        	int user_idx = list.indexOf(user_id);
        	int report_idx = list.indexOf(report_id);
        	if (!reports[user_idx][report_idx]) {
        		reports[user_idx][report_idx] = true;
        		count[report_idx]++;
        	}
        }
        
        for (int i = 0; i < id_list.length; i++) {
        	if (count[i] >= k) {
        		for (int j = 0; j < id_list.length; j++) {
        			if (reports[j][i]) answer[j]++;
        		}
        	}
        }
        
        return answer;
    }
}