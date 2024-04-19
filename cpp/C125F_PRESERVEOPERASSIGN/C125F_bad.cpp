
class A
{
public:
    A &operator=(A const &rhs);
};

A const operator+(A const &lhs, A const &rhs); // Non-compliant: operator +=가 오버로드되지 않았습니다.

void f(A a1, A a2)
{
    A x;
    x = a1 + a2;
}

void f2(A &a)
{
    &a;
}
