//#include <cstdint>
//
//#define index 10
//#define COPY_ELEMENT ( index ) ( a[ ( index ) ] = b[ ( index ) ] )
//
//uint16_t i = 0;
//
//void f(uint16_t a, uint16_t b)
//{
//
//}
//
//void g() 
//{
//
//}
//
//int fake_main()
//{
//	COPY_ELEMENT(i++);
//
//	extern volatile uint16_t v1, v2;
//	uint16_t t;
//
//	t = v1 + v2;
//
//	uint16_t i = 0;
//
//	/*
//	 * Unspecified whether this call is equivalent to:
//	 *      f ( 0, 0 )
//	 * or   f ( 0, 1 )
//	 */
//	f(i++, i);
//
//	p->f(g(&p));
//	
//	return 0;
//}