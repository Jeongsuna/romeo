// #include <stdio.h> �߰�
// main() �߰�
// 10~12�� �߰�

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