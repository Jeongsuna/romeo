#include <cstdint>
/* badcode */
extern int32_t array2[]; /* Non-compliant */
/* goodcode */
extern int32_t array1[10]; /* Compliant*/
int main() {
	return 0;
}