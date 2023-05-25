import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        float[] nscore = new float[n];
        float total = 0f;
        
        for (int i = 0; i < n; i++) {
        	score[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (score[j] > score[i]){
                    int temp = score[j];
                    score[j] = score[i];
                    score[i] = temp;
                }
                
            }
        }
        
        for (int i = 0; i < n; i++){
            nscore[i] = score[i] * 100 / (float)score[0];
        }
        
        for (int i = 0; i < n; i++){
            total = total + nscore[i];
        }
        
        System.out.print(total / n);
    }
}