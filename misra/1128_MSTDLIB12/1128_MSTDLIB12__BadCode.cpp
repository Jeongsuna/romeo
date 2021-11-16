#include <cfenv>
#include <arm64_neon.h>

void f(float32_t x, float32_t y) {
    float32_t z;

    feclearexcept(FE_DIVBYZERO); /* Non-compliant */
    z = x / y;

    if (fetestexcept(FE_DIVBYZERO)) /* Non-compliant */ {
    }
    else {
#pragma STDC FENV_ACCESS ON
        z = x * y;
    }
    if (z > x) {
#pragma STDC FENV_ACCESS ON
        if (fetestexcept(FE_OVERFLOW)) /* Non-compliant */ {
        }
    }
}
int main() {
	f(1, 1);
	return 0;
}