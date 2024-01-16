// #include <arm64_neon.h> �߰�
// #include <stdio.h> �߰�
// main() �߰�
// ���� ����
// printf()�� �ٲ�

#include <arm_neon.h>
#include <stdint.h>
#include <stdio.h>

bool bla2 = 0;
bool blb2 = 0;

char cha2 = 'a';
char chb2 = 'b';

int8_t s8a2 = 0;
int8_t s8b2 = 0;
int16_t s16b2 = 0;

uint8_t u8a2 = 0;
uint8_t u8b2 = 0;
uint16_t u16b2 = 0;

_Float32 f32a2 = 1;
_Float32 f32b2 = 1;

enum enuma {a1, a2, a3} ena2, enb2;
enum {K1 = 1, K2 = 2};

int fake_main()
{
	printf("%d", bla2 && blb2);
	printf("%d", bla2 ? u8a2 : u8b2);

	printf("%d", cha2 - chb2);
	printf("%d", cha2 > chb2);

	printf("%d", ena2 > a1);
	printf("%d", K1 * s8a2);

	printf("%d", s8a2 + s16b2);
	printf("%d", -(s8a2) * s8b2);
	printf("%d", s8a2 > 0);
	printf("%d", --s16b2);

	printf("%d", u8a2 + u16b2);
	printf("%d", u8a2 & 2U);

	printf("%d", u8a2 > 0U);
	printf("%d", u8a2 << 2U);
	printf("%d", u8a2 << 1);

	printf("%d", f32a2 + f32b2);
	printf("%d", f32a2 > 0.0);

	printf("%d", cha2 + chb2);
	return 0;
}
