// #include <cstdint> �߰�
// int16_t use_int16(int16_t x) �߰�
// main() �߰�
#include <cstdint>

int16_t use_int16(int16_t x)
{
	return 0;
}

void used_label ( void )
{
	int16_t x = 6;
	if (x > 0)
	{
		goto label1;
	}
	x = -x;
label1: /* Compliant */
	use_int16(x);
}

int main()
{
	return 0;
}
