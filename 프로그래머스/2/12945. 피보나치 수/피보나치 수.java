class Solution {
    static int[] fibo = new int[100001];
	
	public int solution(int n) {
        fibo[0] = 0;
        fibo[1] = 1;
        return Fibo(n) % 1234567;
    }

	private static int Fibo(int n) {
		if (n <= 1 || fibo[n] != 0) return fibo[n];
		else {
			fibo[n] = Fibo(n - 1) % 1234567 + Fibo(n- 2) % 1234567;
			return fibo[n];
		}
	}
}