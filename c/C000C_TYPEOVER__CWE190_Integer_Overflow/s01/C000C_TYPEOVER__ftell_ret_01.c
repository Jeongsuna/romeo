#include <stdio.h>

int C000C_TYPEOVER__ftell_ret_01_bad(FILE* fp)
{
	if (fp) {
		fseek(fp, 0, SEEK_END);
		// flaw: ftell 반환 - long, 함수의 반환 - int
		return ftell(fp);
	}
	return 0;
}

long C000C_TYPEOVER__ftell_ret_01_good(FILE* fp)
{
	if (fp) {
		fseek(fp, 0, SEEK_END);
		return ftell(fp);
	}
	return 0;
}