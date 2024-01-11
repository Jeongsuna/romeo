#include <stdio.h>

int main() {
    int a = -1;
    unsigned int b = 1U;

    if (a > b) {
        printf("a is greater than b\n");
    } else {
        printf("b is greater than a\n");
    }

    return 0;
}
