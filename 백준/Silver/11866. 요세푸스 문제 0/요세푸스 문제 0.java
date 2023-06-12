import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		StringBuilder ans = new StringBuilder();
		ans.append("<");
		
		while(q.size() > 1) {
//			queue의 첫번째 값을 반환과 동시에 맨 뒤에 추가
			for (int i = 0; i < k - 1; i++) {
				int val = q.poll();
				q.offer(val);
			}
			ans.append(q.poll()).append(", ");
		}
		ans.append(q.poll()).append(">");
		System.out.println(ans);
    }
}