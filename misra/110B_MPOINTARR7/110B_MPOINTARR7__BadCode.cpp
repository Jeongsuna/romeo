#include <stdlib.h>
#include <cstdint>

static struct ss{
	uint16_t len;
	uint32_t data[];     /* Non-compliant - flexible array member */
} str;

struct ss* copy(struct ss* s1)
{
	struct ss* s2;

	/* Omit malloc ( ) return check for brevity */
	s2 = (ss*) malloc(sizeof(struct ss) + (s1->len * sizeof(uint32_t)));

	*s2 = *s1;      /* Only copies s1->len */

	return s2;
}

int fake_main()
{
	return 0;
}