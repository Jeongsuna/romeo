#include <iostream>

typedef int32_t TYPE;
void g();

template <typename T>
class B;

template <typename T>
class A : public B<T>
{
    void f1()
    {
        // 템플릿 클래스 B의 종속된 이름을 직접 명시하지 않았습니다.(비준수)
        TYPE t = 0;
        // this->를 사용하지 않아 현재 클래스의 멤버인 것처럼 참조하지 않았습니다.(비준수)
        g();
    }
};

template <typename T>
class B
{
public:
    typedef T TYPE;
    void g();
};

int main(void){return 0;}