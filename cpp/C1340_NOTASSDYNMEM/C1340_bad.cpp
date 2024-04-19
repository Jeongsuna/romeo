#include <cstdint>
#include <cstdlib>

void f1 ( )
{
    // 동적 메모리를 할당하고 있습니다.(비준수)
    int32_t * i = new int32_t;

    delete i;

}

void f2 ( )
{
    // malloc 과 calloc을 사용하고있습니다. (비준수)
    int *ptr1 = (int*)malloc(sizeof(int));
    int *ptr2 = (int*)calloc(1, sizeof(int));
    if (ptr1 == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }
    if (ptr2 == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }
    // Assign a value to the allocated memory
    *ptr1 = 42;
    *ptr2 = 42;

    // Free the allocated memory
    free(ptr1);
    free(ptr2);

}

int main()
{
    f1();
    return 0;
}
