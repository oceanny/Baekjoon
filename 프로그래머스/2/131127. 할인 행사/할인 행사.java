import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for (int i = 0; i < discount.length - 10 + 1; i++) {
            Map<String, Integer> dscMap = new HashMap<>();
            
            for (int j = 0; j < 10; j++) {
                dscMap.put(discount[i + j], dscMap.getOrDefault(discount[i + j], 0) + 1);
            }
            
            boolean check = true;
            
            for (String key : map.keySet()) {
                if (map.get(key) != dscMap.get(key)) {
                    check = false;
                    break;
                }
            }
            
            if (check) answer++;
        }
        
        return answer;
    }
}