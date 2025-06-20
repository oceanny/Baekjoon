import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int zero = 0;
        int one = 0;
        char ch = S.charAt(0);
        boolean last_zero = ch == '0';

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == ch) continue;
            else {
                if (ch == '0') {
                    zero++;
                    last_zero = true;
                }
                else {
                    one++;
                    last_zero = false;
                }

                ch = S.charAt(i);
            }
        }

        if (last_zero && ch == '1') one++;
        else if (!last_zero && ch == '0') zero++;

        if (zero * one == 0 && zero + one != 0) System.out.println(Math.max(zero, one));
        else System.out.println(Math.min(zero, one));
    }
}