#include <cstdint>

class B {
public:
	uint16_t x = 1;

};
class C {
public:
	uint16_t x = 1;

};

int main()
{
	uint16_t u8a = 0;
	uint16_t u8b = 0;
	uint16_t u8c = 0;
	uint16_t i = 0;
	uint16_t x = 3;
	int32_t a[5] = { 1, 2, 3, 4, 5 };
	uint16_t* p = &u8a;
	B b;
	C cpoint;
	C *c;
	c = &cpoint;

	++u8b;
	u8a = u8b + u8c;
	u8c--;

	x++;
	a[i]++;
	b.x++;
	c->x++;
	++(*p);
	*p++;
	(*p)++;

	return 0;
}
