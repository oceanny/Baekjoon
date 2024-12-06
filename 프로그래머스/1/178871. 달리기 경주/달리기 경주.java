import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer;
        
        Map<String, Integer> name = new HashMap<>();
        Map<Integer, String> order = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
        	name.put(players[i], i);
        	order.put(i, players[i]);
        }
        
        for (int i = 0; i < callings.length; i++) {
        	int now_order = name.get(callings[i]);
        	String now_player = order.get(now_order);
        	String next_player = order.get(now_order - 1);
        	int next_order = name.get(next_player);
        	
        	name.put(next_player, now_order);
        	name.put(now_player, next_order);
        	order.put(now_order, next_player);
        	order.put(next_order, now_player);
        }
        
        answer = new String[name.size()];
        
        for (int i = 0; i < name.size(); i++) {
        	answer[i] = order.get(i);
        }
        
        return answer;
    }
}