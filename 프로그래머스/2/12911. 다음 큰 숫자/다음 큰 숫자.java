class Solution {
    public int solution(int n) {
        String binaryN = Integer.toBinaryString(n);
        int cntN = 0;
        for (int i = 0; i < binaryN.length(); i++) {
        	if (binaryN.charAt(i) == '1') cntN++;
        }
        
        while (true) {
        	n++;
        	String binaryNew = Integer.toBinaryString(n);
        	int cntNew = 0;
        	for (int i = 0; i < binaryNew.length(); i++) {
        		if (binaryNew.charAt(i) == '1') cntNew++;
        	}
        	if (cntNew == cntN) break;
        }
        
        return n;
    }
}