#undef  __LINE__      /* Non-compliant - begins with _ */
#define _GUARD_H 1    /* Non-compliant - begins with _ */
#undef  _BUILTIN_sqrt /* Non-compliant - the implementation
                       * may use _BUILTIN_sqrt for other
                       * purposes, e.g. generating a sqrt
                       * instruction */

#define defined       /* Non-compliant - reserved identifier */
#define errno my_errno/* Non-compliant - library identifier */

int fake_main()
{
    return 0;
}