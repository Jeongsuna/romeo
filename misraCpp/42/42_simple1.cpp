#include <iostream>

// 선언
extern int32_t a; 
extern int32_t b []; 
extern char c;
int32_t f1 ( ); 
int32_t f2 ( int32_t );

// 정의
int32_t a = 10;
int32_t b[5] = {1, 2, 3, 4, 5};
char c = 'c';

int32_t f1() {
    return a;
}

int32_t f2(int32_t x) {
    return x * 2;
}

int main() {
    std::cout << "a: " << a << std::endl;
    std::cout << "b[0]: " << b[0] << std::endl;
    std::cout << "c: " << c << std::endl;
    std::cout << "f1(): " << f1() << std::endl;
    std::cout << "f2(5): " << f2(5) << std::endl;

    return 0;
}
