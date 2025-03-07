import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);

        int val = 0;

        for (int i = sqrt; i > 0; i--) {
            val = n - i * i;
            if (val == 0) {
                System.out.println(1);
                return;
            }
            for (int j = (int) Math.sqrt(val); j > 0 ; j--) {
                val = n - i * i - j * j;
                if (val == 0) {
                    System.out.println(2);
                    return;
                }
                for (int k = (int) Math.sqrt(val); k > 0; k--) {
                    val = n - i * i - j * j - k * k;
                    if (val == 0) {
                        answer = 3;
                        break;
                    }
                    if (answer != 3) {
                        int l = (int) Math.sqrt(val);
                        val -= l * l;
                        if (val == 0) {
                            answer = 4;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}