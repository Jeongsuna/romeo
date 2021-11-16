#include <cstdint>
#include <arm_neon.h>

/* Non-compliant - y[ 2 ] is implicitly initialized */
int32_t y[3] = { 0, 1 };
/* Non-compliant - t[ 0 ] and t[ 3 ] are implicitly initialized */
float32_t t[4] = { t[1] = 1.0f, 2.0f };

int main() {
	return 0;
}