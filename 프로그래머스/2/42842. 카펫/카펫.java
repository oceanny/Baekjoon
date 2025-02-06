class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int w = 0;
        int h = 0;
        int multi = brown + yellow;
        int sum = brown / 2 + 2;
        
        for (int i = 1; i < sum - 1; i++) {
            int k = sum - i;
            if (i * k == multi) {
                w = Math.max(i, k);
                h = Math.min(i, k);
                break;
            }
        }
        answer[0] = w;
        answer[1] = h;
        return answer;
    }
}