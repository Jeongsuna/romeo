#include <iostream>
#include <cstdint>

struct A {
    int32_t i;
};

// offsetof 매크로를 대체하기 위해 std::uintptr_t를 사용합니다. (준수)
void f1() {
    A obj;

    // 멤버 i의 주소를 구합니다.
    std::uintptr_t address_of_i = reinterpret_cast<std::uintptr_t>(&obj.i);

    // A 객체의 주소를 구합니다.
    std::uintptr_t address_of_A = reinterpret_cast<std::uintptr_t>(&obj);

    // 멤버 i와 A 객체의 주소 차이를 계산하여 오프셋을 구합니다.
    std::ptrdiff_t offset = address_of_i - address_of_A;

    std::cout << "Offset of member i in struct A: " << offset << std::endl;
}