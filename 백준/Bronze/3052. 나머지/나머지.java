import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] res = new int[10];
        int ans = 0;
        
        for(int i = 0; i < 10; i++){
            num[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            res[i] = num[i] % 42;
//            System.out.println(res[i]);
        }
        
        for(int i = 0; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                if (res[i] == res[j]){
                    res[i] = 42;
                    continue;
                }
            }
        }
        
        for(int i = 0; i < 10; i++){
        	if (res[i] != 42) ans++;
        }
        
        System.out.print(ans);
        }
	}
