import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String search = br.readLine();
        int len = search.length();
        int cnt = 0;

        for (int i = 0; i <= str.length() - len; i++) {
            String tmp = str.substring(i, i + len);
            if (tmp.equals(search)) {
                cnt++;
                i += len - 1;
            }
        }

        System.out.println(cnt);
    }
}