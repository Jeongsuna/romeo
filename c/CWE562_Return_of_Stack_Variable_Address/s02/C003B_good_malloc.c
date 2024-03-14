#include <stdlib.h>
#include <stdio.h>

int* twoSum(int* returnSize);


int* sushudeshuzu(int n, int* returnSize);

int main() {
    int size;
    int *a;
    a = twoSum(&size);
    printf("size = %d\n", size);
    for (int i = 0; i < size; i++)
        printf("%3d", a[i]);
    printf("\n");

    int* x = sushudeshuzu(10, &size);
    return 0;
}

int* sushudeshuzu(int n, int* returnSize){
    // int a[3] = {1, 2, 3};
    int *pa = malloc(sizeof(int) * 4);
    return pa;
}
