class Solution {
    public double solution(int[] arr) {
        
        int tot = 0;
        for (int i = 0; i < arr.length ; i++){
            tot = tot + arr[i];
        }
        double answer = 0;
        answer = (double)tot / arr.length;
        
        return answer;
    }
}