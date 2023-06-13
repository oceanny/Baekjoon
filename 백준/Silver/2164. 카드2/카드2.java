import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while(q.size() > 1) {
			q.poll();
			int temp = q.poll();
			q.offer(temp);
		}
		
		int ans = q.poll();
		
		System.out.println(ans);
    }
}