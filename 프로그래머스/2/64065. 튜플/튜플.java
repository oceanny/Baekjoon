import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] arr = s.substring(2, s.length() - 2).split("\\},\\{");
        answer = new int[arr.length];
        
        Arrays.sort(arr, new Comparator<>() {
        	@Override
        	public int compare(String o1, String o2) {
        		return o1.length() - o2.length();
        	}
        });
        
        Set<Integer> ansSet = new LinkedHashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
        	String[] tmp = arr[i].split(",");
        	for (int j = 0; j < tmp.length; j++) {
        		ansSet.add(Integer.parseInt(tmp[j]));
        	}
        }
        
        int idx = 0;
        for (int num : ansSet) {
        	answer[idx] = num;
        	idx++;
        }
        
        return answer;
    }
}