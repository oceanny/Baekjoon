import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine().replaceAll("[\\[\\]]", "");
            StringTokenizer st = new StringTokenizer(str, ",");
            List<String> list = new ArrayList<>();
            boolean reverse = false;
            boolean error = false;

            for (int j = 0; j < n; j++) {
                list.add(st.nextToken());
            }

            for (int j = 0; j < p.length(); j++) {
                switch (p.charAt(j)) {
                    case 'R':
                        reverse = !reverse;
                        break;
                    case 'D':
                        if (list.isEmpty()) {
                            error = true;
                            break;
                        }
                        if (reverse) list.remove(list.size() - 1);
                        else list.remove(0);
                        break;
                }
                if (error) break;
            }

            if (error) {
                System.out.println("error");
            }
            else {
                if (reverse && !list.isEmpty()) Collections.reverse(list);
                sb = new StringBuilder();
                sb.append("[");
                for (int j = 0; j < list.size(); j++ ) {
                    sb.append(list.get(j));
                    if (j != list.size() - 1) sb.append(",");
                }
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}