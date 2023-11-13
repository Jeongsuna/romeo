#include <iostream>

typedef int32_t TYPE;
void g();

template <typename T>
class B;

template <typename T>
class A : public B<T>
{
    void f2()
    {
        // 템플릿 클래스 B와 무관한 글로벌 스코프에서 참조(준수)
        ::TYPE t1 = 0;
        // 템플릿 클래스 B와 무관한 글로벌 스코프에서 호출(준수)
        ::g();      
        // 템플릿 클래스 B의 멤버를 명시적으로 참조(준수)
        typename B<T>::TYPE t2 = 0; 
        // 템플릿 클래스 B의 멤버 함수를 명시적으로 호출(준수)
        this->g();                   
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