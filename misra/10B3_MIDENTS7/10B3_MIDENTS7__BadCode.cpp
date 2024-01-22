#include <cstdint>

struct stag
{
	uint16_t a;
	uint16_t b;
};
struct stag a1 = { 0, 0 }; /* Compliant - compatible with above */
union stag a2 = { 0, 0 }; /* Non-compliant - declares different type
//* from struct stag.
//* Constraint violation in C99 */
struct deer
{
	uint16_t a;
	uint16_t b;
};
void foo(void)
{
	struct deer
	{
		uint16_t a;
	}; /* Non-compliant - tag ""deer"" reused */
}
typedef struct coord
{
	uint16_t x;
	uint16_t y;
} coord; /* Compliant by Exception */
struct elk
{
	uint16_t x;
};
struct elk /* Non-compliant - declaration of different type
* Constraint violation in C99 */
{
	uint32_t x;
};

int main()
{

	return 0;
}