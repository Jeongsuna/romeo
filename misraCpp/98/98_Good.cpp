// 16비트 int 타입을 사용하는 머신과 32비트 long 타입을 사용하는 전처리기를 가진 환경 예:

#define START 0x8000 
#define END 0xFFFF 
#define LEN 0x8000

// START와 LEN이 unsigned long으로 처리 (준수)
#if ( (START + LEN) > END )
#error Buffer Overrun 
#endif