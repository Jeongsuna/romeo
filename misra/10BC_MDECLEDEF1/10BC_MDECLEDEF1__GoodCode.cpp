#include <cstdint>

extern int16_t x; /* Compliant - explicit type */
const int16_t y = 0; /* Compliant - explicit type */ /* FLAW */ 
extern int16_t f(void); /* Compliant */
extern void g(char c, const int16_t k); /* Compliant */
typedef int16_t(*pfi) (void); /* Compliant */
typedef void (*pfv) (int16_t x); /* Compliant */
struct str
{
	int16_t x; /* Compliant */
} s;

int main() {
	return 0;
}