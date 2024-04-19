class A
{
public:
    //단항 & 연산자 오버로딩을 제거합니다.(준수)
};

class A;
void f(A &a)
{
    // Compliant: 내장된(빌트인) & 연산자를 사용합니다
    &a;
}
