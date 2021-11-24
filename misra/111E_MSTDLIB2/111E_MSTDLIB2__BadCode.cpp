/*
 * Include <stddef.h> to define size_t
 */
#include <stddef.h>
typedef double float64_t;

// extern void* memcpy(void* restrict s1, const void* restrict s2, size_t n) {};

//extern double sqrt(double x) {};

// #define sqrt( x ) ( _BUILTIN_sqrt ( x ) )

static double _BUILTIN_sqrt2(double x)   /* Non-compliant */
{
    return x * x;
}
#include <math.h>

int fake_main()
{
    float64_t x = sqrt((float64_t)2.0);   /* sqrt may not behave as
                                             * defined in The Standard */

    return 0;
}