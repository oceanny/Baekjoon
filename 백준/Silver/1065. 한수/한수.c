#include <stdio.h>

int main(void){
    int num[1000] = {0};
    int hs[1000] = {0};
    int n;
    int hsn = 0;
    scanf("%d", &n);
    
    for (int i=0; i<n; i++){
        num[i] = i+1;
    }
    
    for (int i=0; i<99; i++){
        hs[i] = i+1;
        hsn++;
        if (i==n-1)
            break;
    }
    
    if (n>99){
        for (int i=99; i<n; i++){
            int a = num[i]/100;
            int b = (num[i]%100)/10;
            int c = num[i]%10;
            if ((a+c)==2*b)
                hsn++;
            else
                continue;
        }
    }
    
    printf("%d", hsn);
    return 0;
}