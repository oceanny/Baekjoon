class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int max_height = n % w == 0 ? n / w : n / w + 1;
        int last_index = max_height % 2 == 0 ?
                        n % w == 0 ? 0 : w - (n % w  - 1) - 1 :
                        n % w == 0 ? w - 1 : n % w - 1;
        int target_height = num % w == 0 ? num / w : num / w + 1;
        int target_index = target_height % 2 == 0 ?
                        num % w == 0 ? 0 : w - (num % w  - 1) - 1 :
                        num % w == 0 ? w - 1 : num % w - 1;
        
        if (max_height % 2 == 0) {
            if (last_index > target_index)
                answer = max_height - target_height;
            else
                answer = max_height - target_height + 1;
        }
        else {
            if (last_index >= target_index)
                answer = max_height - target_height + 1;
            else
                answer = max_height - target_height;
        }
            
        return answer;
    }
}