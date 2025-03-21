import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited = new boolean[100001];
    static int[] time = new int[100001];
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs(N);
        System.out.println(time[K]);
    }

    private static void bfs(int n) {
        visited[n] = true;
        Queue<Integer> que = new LinkedList<>();
        que.offer(n);

        while(!que.isEmpty()) {
            int x = que.poll();
            if (x == K) break;
            for (int i = 0; i < 3; i++) {
                int nx = 0;
                switch (i) {
                    case 0: nx = x - 1; break;
                    case 1: nx = x + 1; break;
                    case 2: nx = x * 2; break;
                }

                if (nx >= 0 && nx <= 100000 && !visited[nx]) {
                    time[nx] = time[x] + 1;
                    visited[nx] = true;
                    que.offer(nx);
                }
            }
        }
    }
}