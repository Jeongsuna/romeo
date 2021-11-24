/*
 * Include <stddef.h> to define size_t
 */
#include <stddef.h>
typedef double float64_t;

// extern void* memcpy(void* restrict s1, const void* restrict s2, size_t n) {};

// extern double sqrt(double x) {};

/* sqrt_s is not reserved identifier or reserved macro name */
#define sqrt_s( x ) ( _BUILTIN_sqrt ( x ) )

static double _BUILTIN_sqrt(double x)   /* Compliant */
{
    return x * x;
}
#include <math.h>

int main()
{
    float64_t x = sqrt((float64_t)2.0);   /* sqrt behave as
                                             * defined in The Standard */

    return 0;
}