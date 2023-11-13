#include <iostream>

typedef char char_t;

void fn()
{
    // const char_t a[2] = "\k"; // Non-compliant
    const char_t b[2] = "\b"; // Compliant
}

int main()
{
    std::cout << "함수 fn을 호출합니다." << std::endl;
    fn();
    std::cout << "함수 fn 호출이 완료되었습니다." << std::endl;
    return 0;
}
