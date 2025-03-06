import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("[-]");
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            String[] tmp = arr[i].split("[+]");

            int ps = 0;
            for (int j = 0; j < tmp.length; j++) {
                ps += Integer.parseInt(tmp[j]);
            }

            if (sum == Integer.MAX_VALUE) sum = ps;
            else sum -= ps;
        }

        System.out.println(sum);

    }
}