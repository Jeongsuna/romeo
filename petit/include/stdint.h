#define __stdint_join3(a,b,c) a ## b ## c

#define __intn_t(n) __stdint_join3( int, n, _t)
#define __uintn_t(n) __stdint_join3(uint, n, _t)

#ifndef _INTPTR_T
#ifndef __intptr_t_defined
typedef  __intn_t(__INTPTR_WIDTH__)  intptr_t;
#define __intptr_t_defined
#define _INTPTR_T
#endif
#endif