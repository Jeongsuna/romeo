#include <iostream>

typedef char char_t;

void fn()
{
    const char_t w1[2] = "\k"; // Non-compliant
    const char_t *w2 = "\F3"; // Non-compliant. wrong octal
    const char_t c1[2] = "\n"; // Compliant
    const char_t c2[2] = "\t"; // Compliant
    const char_t c3[2] = "\v"; // Compliant
    const char_t c4[2] = "\b"; // Compliant
    const char_t c5[2] = "\r"; // Compliant
    const char_t c6[2] = "\f"; // Compliant
    const char_t c7[2] = "\a"; // Compliant
    const char_t c8[2] = "\\"; // Compliant
    const char_t c9[2] = "\?"; // Compliant
    const char_t c10[2] = "\'"; // Compliant
    const char_t c11[2] = "\""; // Compliant
    const char_t *c12 = "\3726"; // Compliant. octal
    const char_t *c13 = "\xEA23"; // Compliant. hex


}

int main()
{
    std::cout << "함수 fn을 호출합니다." << std::endl;
    fn();
    std::cout << "함수 fn 호출이 완료되었습니다." << std::endl;
    return 0;
}
