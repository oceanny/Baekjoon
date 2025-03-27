import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        if (X == 1) {
            System.out.println("1/1");
            return;
        }

        int num = 1;
        boolean odd = true;
        int col = 0;

        while (X > num) {
            col++;
            if (odd) {
                num += col * 2;
                odd = false;
            }
            else {
                num++;
                odd = true;
            }
        }

        if (X == num) {
            System.out.println(col + 1 + "/" + 1);
        }
        else if (X >= num - col) {
            int diff = num - X;
            System.out.println((col - diff + 1) + "/" + (1 + diff));
        }
        else {
            num -= col * 2;
            int diff = X - num;
            System.out.println((col - diff) + "/" + (1 + diff));
        }
    }
}