// #include <cstdint> �߰�
// int16_t use_int16(int16_t x) �߰�
// main() �߰�
#include <cstdint>

int16_t use_int16(int16_t x)
{
	return 0;
}

void unused_label ( void )
{
	int16_t x = 6;
label1: /* Non-compliant */
	use_int16(x);
}

int main()
{

	return 0;

}
