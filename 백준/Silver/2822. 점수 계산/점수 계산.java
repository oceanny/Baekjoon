import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int[] key = new int[5];
        int cnt = 0;
        int sum = 0;

        for (int i = 1; i <= 8; i++) {
            map.put(Integer.parseInt(br.readLine()), i);
        }

        List<Integer> score = new ArrayList<>(map.keySet());
        Collections.sort(score);
        Collections.reverse(score);

        for (int num : score) {
            if (cnt == 5)
                break;
            key[cnt] = map.get(num);
            sum += num;
            cnt++;
        }

        sb.append(sum).append("\n");
        Arrays.sort(key);
        for (int i : key) {
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }
}