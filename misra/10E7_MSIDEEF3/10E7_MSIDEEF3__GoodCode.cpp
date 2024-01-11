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
	uint16_t u8a_2 = 0;
	uint16_t u8b_2 = 0;
	uint16_t u8c_2 = 0;
	uint16_t i_2 = 0;
	uint16_t x_2 = 3;
	int32_t a_2[5] = { 1, 2, 3, 4, 5 };
	uint16_t* p_2 = &u8a;
	B b_2;
	C cpoint_2;
	C *c_2;
	c_2 = &cpoint_2;

	++u8b_2;
	u8a_2 = u8b_2 + u8c_2;
	u8c_2--;

	x_2++;
	a_2[i]++;
	b_2.x_2++;
	c_2->x_2++;
	++(*p_2);
	*p_2++;
	(*p_2)++;

	return 0;
}
