#include <iostream>

void modify2(int* ptr1, const int* ptr2) {
    // ptr1이 가리키는 객체를 수정
    *ptr1 = *ptr1 + *ptr2;

    // ptr2는 const로 선언되어 있으므로 수정할 수 없음
}

int main() {
    int x = 5;
    int y = 10;
    modify2(&x, &y);  // x는 modify 함수 내에서 수정되고, y는 수정되지 않음
    std::cout << "x: " << x << ", y: " << y << std::endl;  // 출력: x: 15, y: 10
    return 0;
}
