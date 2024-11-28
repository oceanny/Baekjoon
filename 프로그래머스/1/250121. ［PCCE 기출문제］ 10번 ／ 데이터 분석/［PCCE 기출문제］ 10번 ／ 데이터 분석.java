import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        
        int criteria = -1;
        int tmp = -1;
        switch (ext) {
        case "code": criteria = 0; break;
        case "date": criteria = 1; break;
        case "maximum": criteria = 2; break;
        case "remain": criteria = 3; break;
        }
        switch (sort_by) {
        case "code": tmp = 0; break;
        case "date": tmp = 1; break;
        case "maximum": tmp = 2; break;
        case "remain": tmp = 3; break;
        }
        
        int sort = tmp;
        
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
        	if (data[i][criteria] >= val_ext) continue;
        	list.add(data[i]);
        }
        
        Collections.sort(list, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[sort] - o2[sort];
			}});
        
        answer = new int[list.size()][data[0].length];
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}