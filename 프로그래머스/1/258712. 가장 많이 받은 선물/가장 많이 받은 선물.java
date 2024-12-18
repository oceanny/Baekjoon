import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        List<String> list = Arrays.asList(friends);
        int len = friends.length;
        int[][] table = new int[len][len + 2];
        StringTokenizer st;
        for (int i = 0; i < gifts.length; i++) {
        	st = new StringTokenizer(gifts[i]);
        	String give = st.nextToken();
        	String take = st.nextToken();
        	
        	table[list.indexOf(give)][list.indexOf(take)]++;
        	table[list.indexOf(give)][len]++;
        	table[list.indexOf(take)][len]--;
        }
        for (int i = 0; i < len; i++) {
        	for (int j = i + 1; j < len; j++) {
        		if (table[i][j] > table[j][i]) table[i][len + 1]++;
        		else if (table[i][j] == table[j][i]) {
        			if (table[i][len] > table[j][len]) table[i][len + 1]++;
        			else if (table[j][len] > table[i][len]) table[j][len + 1]++;
        		}
        		else table[j][len + 1]++;
        	}
        }
        
        for (int i = 0; i < len; i++) {
        	if (table[i][len + 1] > answer) answer = table[i][len + 1];
        }
        
        return answer;
    }
}