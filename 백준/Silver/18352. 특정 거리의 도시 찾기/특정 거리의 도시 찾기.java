import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static int[] dist;
    static int cnt = 0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        dist = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[A].add(B);
        }

        Arrays.fill(dist, -1);
        bfs(X);

        boolean check = false;
        for (int i = 1; i <= N; i++) {
            if (dist[i] == K) {
                check = true;
                System.out.println(i);
            }
        }

        if (!check) System.out.println(-1);
    }

    private static void bfs(int x) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(x);
        dist[x] = 0;

        while (!que.isEmpty()) {
            int tmp = que.poll();
            cnt = dist[tmp] + 1;

            for (int i : graph[tmp]) {
                if (dist[i] == -1) {
                    dist[i] = cnt;
                    que.offer(i);
                }
            }
        }
    }
}