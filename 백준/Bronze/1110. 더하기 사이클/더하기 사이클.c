#include <stdio.h>

int main(void){
    int a, b, x, y;
    int n = 0;
    scanf("%d", &a);
    int c = a;
    while (1)
    {
        x = a/10;
        y = a%10;
        b = (x + y)%10 + 10*y;
        n++;
        a = b;
        if (c==b)
            break;
        else
            continue;
    }
    printf("%d", n);
    return 0;
}