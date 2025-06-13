import java.io.*;
import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        cal(N);

    }

    private static void cal(int n) {
        if (n == 0) {
            printBar(n);
            System.out.println("\"재귀함수가 뭔가요?\"");
            printBar(n);
            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            printBar(n);
            System.out.println("라고 답변하였지.");
            return;
        }

        printBar(n);
        System.out.println("\"재귀함수가 뭔가요?\"");
        printBar(n);
        System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        printBar(n);
        System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        printBar(n);
        System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        cal(n - 1);

        printBar(n);
        System.out.println("라고 답변하였지.");
    }

    private static void printBar(int i) {
        String bar = "____";
        for (int j = N; j > i; j--) {
            System.out.print(bar);
        }
    }
}