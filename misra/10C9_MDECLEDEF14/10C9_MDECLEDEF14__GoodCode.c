// #include <stdio.h> 추가
// main() 추가
// 10~12줄 추가

#include <stdio.h>
#include <string.h>

void f(void) {
    /* memcpy has restrict-qualified parameters */
    int p[] = { 1,2,3 };
    int q[3];
    int n = sizeof(int) * 3;


    memcpy(p, q, n);
}

int fake_main()
{
    return 0;
}