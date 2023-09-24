#include <stdio.h>

int main(void){
    int a, b, c, d;
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    d = a*b*c;
    int e = d;
    int l = 0;
    while (e!=0){
        e = e/10;
        l++;
    }
    e = d;
    int arr[10] = {0};
    for (int i=0; i<l; i++){
        if ((e%10)==0)
            arr[0]++;
        else if ((e%10)==1)
            arr[1]++;
        else if ((e%10)==2)
            arr[2]++;
        else if ((e%10)==3)
            arr[3]++;
        else if ((e%10)==4)
            arr[4]++;
        else if ((e%10)==5)
            arr[5]++;
        else if ((e%10)==6)
            arr[6]++;
        else if ((e%10)==7)
            arr[7]++;
        else if ((e%10)==8)
            arr[8]++;
        else if ((e%10)==9)
            arr[9]++;
        e = e/10;
    }
    for (int i=0; i<10; i++){
        printf("%d", arr[i]);
        printf("\n");
    }
    return 0;
}