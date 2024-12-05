import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        String[] tdy = today.split("\\.");
        int today_year = Integer.parseInt(tdy[0]);
        int today_month = Integer.parseInt(tdy[1]);
        int today_day = Integer.parseInt(tdy[2]);
        
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> trm = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
        	String[] tmp = terms[i].split(" ");
        	trm.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
        	String[] prvc = privacies[i].split(" ")[0].split("\\.");
        	int prvc_year = Integer.parseInt(prvc[0]);
        	int prvc_month = Integer.parseInt(prvc[1]);
        	int prvc_day = Integer.parseInt(prvc[2]);
        	int month = trm.get(privacies[i].split(" ")[1]);
        	
        	prvc_year += month / 12;
        	prvc_month += month - month / 12 * 12;
        	prvc_day--;
        	
        	if (prvc_day == 0) {
        		prvc_month--;
        		prvc_day = 28;
        	}
        	
        	if (prvc_month > 12) {
        		prvc_month -= 12;
        		prvc_year++;
        	}
        	
        	if (prvc_year < today_year) {
        		list.add(i + 1);
        		continue;
        	}
        	else if (prvc_year > today_year) {
        		continue;
        	}
        	else if (prvc_month < today_month){
        		list.add(i + 1);
        		continue;
        	}
        	else if (prvc_month > today_month) {
        		continue;
        	}
        	else if (prvc_day < today_day) {
        		list.add(i + 1);
        	}
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}