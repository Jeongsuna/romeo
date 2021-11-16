#include <stdlib.h>
#include <cstdint>

static struct s{
	uint16_t len;
	uint32_t data;     /* compliant */
} str;

struct s* copy(struct s* s1)
{
	struct s* s2;

	/* Omit malloc ( ) return check for brevity */
	s2 = (s*) malloc(sizeof(struct s) + (s1->len * sizeof(uint32_t)));

	*s2 = *s1;      /* Only copies s1->len */

	return s2;
}

int main() {
	return 0;
}