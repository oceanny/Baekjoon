#include <stdio.h>

int main(void){
    int a, b, c, d, e;
    scanf("%d %d", &a, &b);
    c = b%10;
    d = (b%100 - c)/10;
    e = (b - 10*d+c)/100;
    printf("%d\n%d\n%d\n%d", a*c, a*d, a*e, a*b);
    return 0;
}