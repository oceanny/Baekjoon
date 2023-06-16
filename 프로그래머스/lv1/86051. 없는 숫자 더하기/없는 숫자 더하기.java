class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
        	arr[i] = 0;
        }
        for (int i = 0; i < numbers.length; i++) {
        	arr[numbers[i]] = numbers[i];
        }
        for (int i = 0; i < 10; i++) {
        	if (arr[i] != i) answer += i;
        }
        return answer;
    }
}