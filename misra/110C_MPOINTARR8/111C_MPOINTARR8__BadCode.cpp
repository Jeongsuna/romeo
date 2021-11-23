//#include <cstdint>
//
//void f(int16_t n)
//{
//    uint16_t (*vla)[n];        /* Non-compliant - Undefined if n <= 0 */
//}
//
//void g(void)
//{
//    f(0);            /* Undefined */
//    f(-1);           /* Undefined */
//    f(10);           /* Defined */
//}
//
//void h(uint16_t n,
//    uint16_t a[10][n])      /* Non-compliant */
//{
//    uint16_t(*p)[20];
//
//    /* Undefined unless n == 20: incompatible types otherwise */
//    p = a;
//}
//
//int fake_main() 
//{
//    g();
//    h(0, 0);
//    return 0;
//
//}