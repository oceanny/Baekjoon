import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        Map<Integer, Integer> timeMap = new HashMap<>();
        Map<Integer, Integer> moneyMap = new HashMap<>();
        StringTokenizer st;
        
        for (int i = 0; i < records.length; i++) {
        	st = new StringTokenizer(records[i]);
        	String time = st.nextToken();
        	int num = Integer.parseInt(st.nextToken());
        	String type = st.nextToken();
        	
        	int tm = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);
        	switch(type) {
        	case "IN": 
        		timeMap.put(num, tm);
        		break;
        	case "OUT":
        		tm -= timeMap.get(num);
        		moneyMap.put(num, moneyMap.getOrDefault(num, 0) + tm);
        		timeMap.put(num, -1);
        		break;
        	}
        }
        for (int car : timeMap.keySet()) {
        	if (timeMap.get(car) > -1) {
        		int tm = 23 * 60 + 59 - timeMap.get(car);
        		moneyMap.put(car, moneyMap.getOrDefault(car, 0) + tm);
        	}
        }
        answer = new int[moneyMap.size()];
        
        for (int car : moneyMap.keySet()) {
        	int time = moneyMap.get(car);
        	if (time <= fees[0]) moneyMap.put(car, fees[1]);
        	else {
        		time -= fees[0];
        		if (time % fees[2] == 0) moneyMap.put(car, fees[1] + time / fees[2] * fees[3]);
        		else moneyMap.put(car, fees[1] + (time / fees[2] + 1) * fees[3]);
        	}
        }
        
        List<Integer> carList = new ArrayList<>(moneyMap.keySet());
        Collections.sort(carList);
        
        int idx = 0;
        for (int car : carList) {
        	answer[idx] = moneyMap.get(car);
        	idx++;
        }
        
        return answer;
    }
}