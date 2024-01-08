#include <cstdint>
#include <stdlib.h>  

typedef void (*fp16) (int16_t n);
typedef void (*fp32) (int32_t n);

int main()
{
    fp16 fp1 = NULL;
    fp32 fp2 = (fp32)fp1;  /* Non-compliant - function
                               * pointer into different
                               * function pointer */

    fp16 fp3 = (fp16)0x8000;   /* Non-compliant - integer into
                                   * function pointer */
    fp16 fp4 = (fp16)(intptr_t)1.0e6F;   /* Non-compliant - float into
                                   * function pointer */
    return 0;
}