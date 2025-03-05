import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int[] prices = new int[14];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        int jMoney = money;
        int jCnt = 0;
        for (int i = 0; i < 14; i++) {
            int count = jMoney / prices[i];
            jCnt += count;
            jMoney -= count * prices[i];
            if (jMoney <= 0) break;
        }
        jMoney += jCnt * prices[13];

        int sMoney = money;
        int sCnt = 0;
        int[] check = new int[14];
        for (int i = 1; i < 14; i++) {
            if (prices[i] > prices[i - 1]) check[i] = 1;
            else if (prices[i] < prices[i - 1]) check[i] = -1;
        }
        for (int i = 3; i < 14; i++) {
            int chk = check[i] + check[i - 1] + check[i - 2];
            if (chk == 3 && sCnt > 0) {
                sMoney += sCnt * prices[i];
                sCnt = 0;
            }
            else if (chk == -3 && sMoney > 0) {
                sCnt += sMoney / prices[i];
                sMoney = sMoney % prices[i];
            }
        }
        sMoney += sCnt * prices[13];

        if (jMoney > sMoney) System.out.println("BNP");
        else if (jMoney < sMoney) System.out.println("TIMING");
        else System.out.println("SAMESAME");
    }
}