#include <cstdint>
#include <stdlib.h>       /* To obtain macro NULL */

typedef void (*fp16) (int16_t n);
typedef void (*fp32) (int32_t n);

int main()
{
    fp16 fp1 = NULL;          /* Compliant - exception 1 */
    fp16 fp2 = 0;

    if (fp2 != NULL)         /* Compliant - exception 1 */
    {
    }

    typedef fp16(*pfp16) (void);

    pfp16 pfp1 = 0;

    (void)(*pfp1());       /* Compliant - exception 2 - cast function
                                   * pointer into void */

    extern void f(int16_t n);

    f(1);                    /* Compliant - exception 3 - implicit conversion
                                 * of f into pointer to function */
    fp16 fp5 = f;               /* Compliant - exception 3 */

    return 0;
}