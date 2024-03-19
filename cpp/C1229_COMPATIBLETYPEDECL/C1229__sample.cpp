#include <iostream>

// 선언
extern int32_t C1229_a; 
extern int32_t C1229_b []; 
extern char C1229_c;
int32_t C1229_f1 ( ); 
int32_t C1229_f2 ( int32_t );

// 정의
int32_t C1229_a = 10;
int32_t C1229_b[5] = {1, 2, 3, 4, 5};
char C1229_c = 'c';

int32_t C1229_f1() {
    return C1229_a;
}

int32_t C1229_f2(int32_t x) {
    return x * 2;
}

int main() {
    std::cout << "C1229_a: " << C1229_a << std::endl;
    std::cout << "C1229_b[0]: " << C1229_b[0] << std::endl;
    std::cout << "C1229_c: " << C1229_c << std::endl;
    std::cout << "C1229_f1(): " << C1229_f1() << std::endl;
    std::cout << "C1229_f2(5): " << C1229_f2(5) << std::endl;

    return 0;
}
