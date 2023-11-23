#include <iostream>
#include <stdint.h>

void func(int a) 
{
  std::cout << a << std::endl;
}

int func2() {
    return 0;  // 수정됨 : 함수 반환에서 NULL 사용
}

int main() 
{
  
  func(0);  // 수정됨 : 함수 호출에서 NULL 사용
  
  int a = 0 + 1;  // 수정됨 : 산술 연산에서 NULL 사용

  if (5 == 0) {}  // 수정됨 : 비교 연산에서 NULL 사용
  
  int b = 0;  // 수정됨 : 할당에서 NULL 사용

  int arr[10];
  int i = arr[0];  // 수정됨 : 배열 인덱스에서 NULL 사용

  int c = 5 & 0;  // 수정됨 : 비트 연산에서 NULL 사용

  int d = (true ? 0 : 1);  // 수정됨 : 조건 연산자에서 NULL 사용

  return 0;
}