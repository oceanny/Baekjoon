import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> que = new PriorityQueue<>((o1, o2) -> {
            if (o1 > o2) return -1;
            else if (o1.equals(o2)) return 0;
            else return 1;
        });

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            long x = Long.parseLong(br.readLine());
            if (x == 0) {
                if (que.isEmpty()) System.out.println(0);
                else System.out.println(que.poll());
            }
            else que.offer(x);
        }
    }
}