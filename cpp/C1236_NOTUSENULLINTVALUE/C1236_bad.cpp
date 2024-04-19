#include <iostream>
#include <stdint.h>

void func(int32_t a) 
{
  std::cout << a << std::endl;
}

int32_t func2() {
    return NULL;  // 위반 : 함수 반환에서 NULL 사용
}

int main() 
{
  
  func(NULL);  // 위반 : 함수 호출에서 NULL 사용
  
  int32_t a = NULL + 1;  // 위반 : 산술 연산에서 NULL 사용

  if (5 == NULL) {}  // 위반 : 비교 연산에서 NULL 사용
  
  int32_t b = NULL;  // 위반 : 할당에서 NULL 사용

  int32_t arr[10];
  int32_t i = arr[NULL];  // 위반 : 배열 인덱스에서 NULL 사용

  int32_t c = 5 & NULL;  // 위반 : 비트 연산에서 NULL 사용

  int32_t d = (true ? NULL : 1);  // 위반 : 조건 연산자에서 NULL 사용

  return 0;
}