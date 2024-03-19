#include <cstdint>

// 변환 단위 A
void foo( ) throw ( const char * )  // foo가 const char_t *를 throw할 가능성이 있음을 예외사양으로 선언
{
    throw "Hello World!";
}

// 변환 단위 B

extern void foo( ) throw ( int32_t );  // foo가 다른 예외 사양으로 선언됨 (비준수)

void b( ) throw ( int32_t )
{
    foo( );  // 컴파일러는 여기서 올바른 동작을 보장할 수 없음
}