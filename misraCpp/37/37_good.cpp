#include <iostream>

int main()
{
    const unsigned int a = 0U;
    const unsigned int b = 0U; // Now-Compliant
    const long c = 0L;
    const long d = 0L; // Now-Compliant
    const unsigned long e = 0UL;
    const unsigned long f = 0UL; // Now-Compliant
    const unsigned int g = 0x12bU;
    const unsigned int h = 0x12bU; // Now-Compliant
    const float m = 1.2F;
    const float n = 2.4F; // Now-Compliant
    const long double p = 1.2L;
    const long double q = 2.4L; // Now-Compliant

    return 0;
}
