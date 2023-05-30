import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();sc.nextLine();
        int num = 0;
        String ans = "";
        int answer = 0;
        String[] name = new String[n];
        String[] anss = new String[n];
        
        for(int i = 0; i < n; i++){
            String[] temp = sc.nextLine().split(" ");
            name[i] = temp[0];
            anss[i] = temp[1];
            if (name[i].equals(s)) {
                num = i;
                ans = anss[i];
            }
        }
        
        for(int i = 0; i < num; i++){
            if (anss[i].equals(ans)) answer = answer + 1;
        }
        
        System.out.println(answer);
        
    }
}