#include <stdio.h>

int main(void){
    int n = 1;
    int arr[9];
    for (int i=0; i<9; i++){
        scanf("%d", &arr[i]);
    }
    int max = arr[0];
    for (int i=0; i<9; i++){
        if (max<arr[i]){
            max=arr[i];
            n = i+1;
        }
    }
    printf("%d\n%d",max, n);
    return 0;
}