import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr.length == 1 ? arr[0] : 0;

        Arrays.sort(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            int a = answer == 0 ? arr[i] : answer;
            int num = gcd(a, arr[i - 1]);
            answer = (a / num) * arr[i - 1];
        }
        
        return answer;
    }
    
    private static int gcd(int a, int b) {
        int c = 0;
        while (b > 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}