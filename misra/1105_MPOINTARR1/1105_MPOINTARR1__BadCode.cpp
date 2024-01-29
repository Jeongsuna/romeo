#include <cstdint>

int32_t f1_2(int32_t* const a1, int32_t a2[10])
{
    int32_t* q = &a1[3];    /* Compliant/non-compliant depending on
                                * the value of a1 */
    return *(a2 + 9);      /* Compliant */
}

void f2_2(void)
{
    int32_t data = 0;
    int32_t b = 0;
    int32_t c[10] = { 0 };
    int32_t d[5][2] = { 0 };  /* 5-element array of 2-element arrays
                                    * of int32_t */

    int32_t* q1 = &c[0];        /* Compliant */
    int32_t q4 = c[10];         /* Non-compliant */
    int32_t* q2 = &c[10];       /* Compliant - points to one beyond */
    int32_t* q3 = &c[11];       /* Non-compliant- undefined, points to
                                    * two beyond */
    data = *q2;                   /* Non-compliant - undefined, dereference
                                    * one beyond */
    data = f1_2(&b, c);
    data = f1_2(c, c);

    c[-1] = 0;                  /* Non-compliant - undefined, array
                                    * bounds exceeded */
    data = c[10];                /* Non-compliant - underfined, dereference
                                    * of address one beyond */
    data = *(&data + 0);        /* Compliant - C treats data as an
                                    * array of size 1 */
    d[3][1] = 0;               /* Compliant */
    data = *(*(d + 3) + 1);   /* Compliant */
    data = d[2][3];            /* Non-compliant  - undefined, internal
                                    * boundary exceeded */
    c[11] = 1;                  /* Non-compliant */
}


struct
{
    uint16_t x;
    uint16_t y;
    uint16_t z;
    uint16_t a[10];
} s;

uint16_t* q;

void f3_2(void)
{
    q = &s.x;
    q[0] = 1;                       /* Non-compliant - undefined, dereference of address one
                                        * beyond s.x which is not necessarily
                                        * the same as s.y */
    q[1] = 2;                       /* Non-compliant - undefined */

    q = q + 3;                          /* Non-compliant - undefined, p points more than one
                                          * beyond s.a */
}

int fake_main() {
    f2_2();
    f3_2();
    return 0;
}