
class C
{
public:
    C &operator=(C const &rhs);
};

C &operator+=(C const &lhs, C const &rhs);
C const operator+(C const &lhs, C const &rhs);

C &operator-=(C const &lhs, C const &rhs);
C const operator-(C const &lhs, C const &rhs);

C &operator*=(C const &lhs, C const &rhs);
C const operator*(C const &lhs, Cconst &rhs);

C &operator/=(C const &lhs, C const &rhs);
C const operator/(C const &lhs, C const &rhs);

void f(C a1, C a2)
{
    C x;
    x = a1 + a2; // Example 1
    a1 += a2;    // Example 2
}