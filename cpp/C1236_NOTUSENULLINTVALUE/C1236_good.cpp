#include <iostream>
#include <stdint32_t.h>

void func(int32_t a) 
{
  std::cout << a << std::endl;
}

int32_t func2() {
    return 0;  // 수정됨 : 함수 반환에서 NULL 사용
}

int main() 
{
  
  func(0);  // 수정됨 : 함수 호출에서 NULL 사용
  
  int32_t a = 0 + 1;  // 수정됨 : 산술 연산에서 NULL 사용

  if (5 == 0) {}  // 수정됨 : 비교 연산에서 NULL 사용
  
  int32_t b = 0;  // 수정됨 : 할당에서 NULL 사용

  int32_t arr[10];
  int32_t i = arr[0];  // 수정됨 : 배열 인덱스에서 NULL 사용

  int32_t c = 5 & 0;  // 수정됨 : 비트 연산에서 NULL 사용

  int32_t d = (true ? 0 : 1);  // 수정됨 : 조건 연산자에서 NULL 사용

  return 0;
}