#include <stdio.h>

void C000C_TYPEOVER__ftell_simple_01_bad()
{
	int nSize;
	FILE *fp = fopen("my_file.txt", "rb");
	if(fp) {
		fseek(fp, 0, SEEK_END);
		// flaw: nSize - int, ftell ret - long
		nSize = ftell(fp);
		fclose(fp);
	}
}
/*
void C000C_TYPEOVER__ftell_simple_01_bad2()
{
	short nSize;
	FILE* fp = fopen("my_file.txt", "rb");
	if (fp) {
		fseek(fp, 0, SEEK_END);
		// flaw: nSize - short, ftell ret - long
		nSize = ftell(fp);
		fclose(fp);
	}
}
*/
void C000C_TYPEOVER__ftell_simple_01_good()
{
	long nSize;
	FILE* fp = fopen("my_file.txt", "rb");
	if (fp) {
		fseek(fp, 0, SEEK_END);
		nSize = ftell(fp);
		fclose(fp);
	}
}