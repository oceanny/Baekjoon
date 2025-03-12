import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        calc(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    private static void calc(int x, int y, int size) {
        boolean check = true;

        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) {
                    check = false;
                    break;
                }
            }
        }

        if (check) {
            if (paper[x][y] == 1) blue++;
            else white++;

            return;
        }

        size /= 2;

        calc(x, y, size);
        calc(x, y + size, size);
        calc(x + size, y, size);
        calc(x + size, y + size, size);
    }
}