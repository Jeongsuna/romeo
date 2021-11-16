#include <cstdint>
extern void g(int* const);
void g(int*); /* Non-compliant - type qualifiers */

extern int16_t func(int16_t num, int16_t den);
/* Non-compliant - parameter names do not match */
int16_t func(int16_t den, int16_t num)
{
	return num / den;
}

typedef uint16_t width_t;
typedef uint16_t height_t;
typedef uint32_t area_t;
extern area_t area(width_t w, height_t h);
area_t area(width_t w, width_t h)
{
	return (area_t)w * h;
}
int main() {
	func(1, 1);
	area(3, 5);
	return 0;
}