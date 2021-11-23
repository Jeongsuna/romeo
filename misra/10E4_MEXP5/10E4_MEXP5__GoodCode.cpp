#include <cstdint>

int32_t glbA2[] = { 1, 2, 3, 4, 5 };

void f2(int32_t a[4])
{
    /*
     * The following is compliant as numElements_glbA will be given the\
     * expected value of 5.
     */
    uint32_t numElements_glbA = sizeof(glbA2) / sizeof(glbA2[0]);
}

int fake_main()
{
    return 0;
}