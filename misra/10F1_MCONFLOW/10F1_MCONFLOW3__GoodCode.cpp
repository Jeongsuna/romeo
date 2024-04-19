#include <cstdint>
void f1_2(int32_t a)
{
	goto L1;      /* Compliant */

	if (a == 0)
	{
		goto L1;    /* Compliant */
	}

L1:
	;
}
int fake_main() {

	f1_2(0);

	int x = 0;
	int y = 0;

	switch (x)
	{
	case 0:
		goto L1;
		break;
	case 1:
		y = x;
L1:
	++x;
	break;

	default:
		break;
	}

	return 0;
}