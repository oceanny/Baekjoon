class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = "" + x;
        String[] arr = str.split("");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
        	temp += Integer.parseInt(arr[i]);
        }
        if (x % temp != 0) answer = false;
        return answer;
    }
}