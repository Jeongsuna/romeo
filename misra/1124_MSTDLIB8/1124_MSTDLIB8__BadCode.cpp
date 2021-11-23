#include <cstdint>
#include <stdio.h>
#include <stdlib.h>

extern void use_char_ptr(char* use_char_ptr_param) {};

void mc2_2011(void)
{
	int32_t mc2_2011_status;
	char* mc2_2011_env;

	mc2_2011_env = getenv("path"); /* Not Compliant - use of getenv() from stdlib.h */

	mc2_2011_status = system(mc2_2011_env); /* Not Compliant - use of system() from stdlib.h */

	if (mc2_2011_status == 0)
	{
		abort();                     /* Not Compliant - use of abort() from stdlib.h */
	}

	if (mc2_2011_status == 1)
	{
		exit(mc2_2011_status);      /* Not Compliant - use of exit() from stdlib.h */
	}

	use_char_ptr(mc2_2011_env);
}

int main(){
	mc2_2011();
	return 0;
}