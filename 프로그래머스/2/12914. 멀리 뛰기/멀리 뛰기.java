class Solution {
    static long[] arr;
    public long solution(int n) {
        arr = new long[2001];
        arr[1] = 1;
        arr[2] = 2;
        return dp(n);
    }
    
    public static long dp(int n) {
        if (arr[n] == 0) {
            arr[n] = (dp(n - 2) % 1234567 + dp(n - 1) % 1234567) % 1234567;
        }
        return arr[n];
    }
}