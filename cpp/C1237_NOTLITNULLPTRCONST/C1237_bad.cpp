#include <iostream>
#include <stdint.h>

void bad_func1(int32_t *x)
{
  std::cout << &x << std::endl;
}

int32_t *bad_func2()
{
  return 0;   // 위반 0을 NULL로 사용
}

int32_t *bad_func3()
{
  return (int32_t *)0;   // 위반 0을 NULL로 사용
}

int main()
{

  bad_func1(0);   // 위반 0을 NULL로 사용

  int32_t *p1 = 0;   // 위반 0을 NULL로 사용

  void (*funcPtr1)() = 0;   // 위반 0을 NULL로 사용

  struct Node *next1 = 0;   // 위반 0을 NULL로 사용

  int32_t *p3 = new (std::nothrow) int32_t;
  if (p3 == 0)   // 위반 0을 NULL로 사용
  {
    // handle error
  }

  if (p1 == 0)   // 위반 0을 NULL로 사용
  {
    // some code
  }

  switch (p1 != 0)   // 위반 0을 NULL로 사용
  {
  case 0:
    // some code
    break;
  default:
    // some code
  }

  return 0;
}