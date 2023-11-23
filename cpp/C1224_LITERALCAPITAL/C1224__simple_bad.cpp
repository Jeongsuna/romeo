#include <iostream>

int main()
{
    const unsigned int a = 0U;
    const unsigned int b = 0u; // Non-compliant
    const long c = 0L;
    const long d = 0l; // Non-compliant
    const unsigned long e = 0UL;
    const unsigned long f = 0Ul; // Non-compliant
    const unsigned int g = 0x12bU;
    const unsigned int h = 0x12bu; // Non-compliant
    const float m = 1.2F;
    const float n = 2.4f; // Non-compliant
    const long double p = 1.2L;
    const long double q = 2.4l; // Non-compliant

    return 0;
}
