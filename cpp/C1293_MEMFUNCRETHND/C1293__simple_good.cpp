#include <iostream>

class C
{
public:
    const int32_t& getA() const
    {
        return a;
    }

private:
    int32_t a;
};

void b(C& c)
{
    // 이제 getA()는 상수 멤버 함수이므로 반환값을 수정할 수 없습니다.
    // a_ref = 10; // 이 줄은 더 이상 유효하지 않습니다.
}

int main(void)
{
    return 0;
}
