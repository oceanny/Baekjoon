class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
         for (int i = 0; i < number.length; i++) {
//          j의 값을 저장해 중복되지 않도록 함
        	int temp = 0;
        	for (int j = i + 1; j < number.length; j++) {
        		for (int k = j + 1; k < number.length; k++) {
        			if ((-number[k] == number[i] + number[j]) && k != temp) {
        				temp = j;
        				answer++;
        			}
        		} 
        	}
        }
        
        return answer;
    }
}