// 16비트 int 타입을 사용하는 머신과 32비트 long 타입을 사용하는 전처리기를 가진 환경 예:

#define START 0x8000 
#define END 0xFFFF 
#define LEN 0x8000

// 뺄셈 결과가 0xFFFFFFFF로 wrap-around 발생합니다(비준수)
#if ( ( (END - START) - LEN ) < 0 )
#error Buffer Overrun 
#endif

void fn ( ) 
{ 
 // START + LEN이 unsigned int 산술로 인해 0x0000으로 wrap-around 발생합니다(비준수)   
 if ( (START + LEN) > END ) 
 { 
 error ( "Buffer overrun" ); 
 } 
}