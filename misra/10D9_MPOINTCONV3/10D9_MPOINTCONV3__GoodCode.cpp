const short* p;
const volatile short* q;

int main()
{
	q = (const volatile short*)p;   /* Compliant */

	return 0;
}
