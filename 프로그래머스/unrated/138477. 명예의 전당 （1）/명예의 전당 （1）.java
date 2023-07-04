import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
		int[] answer = new int[score.length];

		for (int i = 0; i < score.length; i++) {
			if (i < k)
				pq.add(score[i]);
			else if (score[i] > pq.peek()) {
				pq.poll();
				pq.add(score[i]);

			}
			answer[i] = pq.peek();
		}
		return answer;
    }
}