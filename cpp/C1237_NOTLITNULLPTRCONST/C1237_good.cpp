#include <iostream>
#include <stdint.h>

void good_func1(int32_t *x)
{
  std::cout << &x << std::endl;
}

int32_t *good_func2()
{
  return NULL; // 수정 : NULL 반환
}

int main()
{

  good_func1(NULL); // 수정 : 함수 호출에서 NULL 사용

  int32_t *p1 = NULL; // 수정 : NULL 사용

  void (*funcPtr1)() = NULL; // 수정 : NULL 사용

  double *arr1 = NULL; // 수정 : NULL 사용

  struct Node *next1 = NULL; // 수정 : NULL 사용

  int32_t *p3 = new (std::nothrow) int32_t;
  if (p3 == NULL) // 수정 : NULL 사용
  {
    // handle error
  }

  if (p1 == NULL) // 수정 : NULL 사용
  {
    // some code
  }
  
  switch (p1 != NULL) // 수정 : NULL 사용
  {
  case 0:
    // some code
    break;
  default:
    // some code
  }

  return 0;
}
