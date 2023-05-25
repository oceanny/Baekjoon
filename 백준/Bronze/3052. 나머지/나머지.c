#include <stdio.h>

int main(void){
    int ar[10] = {0};
    for (int i=0; i<10; i++){
        scanf("%d", &ar[i]);
    }
    
    int arr[10] = {0};
    for (int i=0; i<10; i++){
        arr[i] = ar[i]%42;
    }
    
    int n = 0;
    int arrr[10] = {0};
    
    for (int i=0; i<10; i++){
        arrr[i] = arr[i];
    }
    
    for (int i=0; i<10; i++){
        for (int j=i+1; j<10; j++){
            if (arrr[i]!=arr[j])
                continue;
            else if (arrr[i]==arr[j])
                arrr[j]=42;
        }
    }
    for (int i=0; i<10; i++){
        if (arrr[i]!=42)
            n+=1;
    }
    
    printf("%d", n);
    
    return 0;
}