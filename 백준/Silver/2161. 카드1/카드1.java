import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        while (!que.isEmpty()) {
            sb.append(que.poll()).append(" ");

            if (!que.isEmpty())
                que.offer(que.poll());
        }

        System.out.println(sb);
    }
}