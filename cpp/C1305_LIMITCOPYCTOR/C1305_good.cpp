#include <cstdint>

class A {
public:
    // 기본 생성자
    A() : m_i(0) {}

    // 복사 생성자에서 m_static 변경을 제거 합니다. - 준수
    A(const A& rhs) : m_i(rhs.m_i) {}

private:
    int32_t m_i;
    static int32_t m_static;
};

int32_t A::m_static = 0;

A f() {
    return A();
}

void b() {
    A a = f();
}

int main() {
    return 0;
}