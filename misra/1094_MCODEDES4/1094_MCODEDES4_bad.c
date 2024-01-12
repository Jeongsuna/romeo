#include <stdint.h>

void bad ( void )
{
   int32_t x;
   /* x = 3;   Non-compliant  */
   x = 5;
   // x = 1234
   use_int32 ( x );
}


