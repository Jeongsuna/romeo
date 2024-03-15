#include <cstdint>

class B1
{
public:
    B1();
    virtual void f() =0;

    // Non-compliant
    B1 &operator=(B1 const &rhs);
    
    int32_t getKind() const { return kind; }
private:
    int32_t kind;
};

class D1 : public B1
{
public:
    virtual void f() {}
    D1 &operator=(D1 const &rhs);
private:
    int32_t member;
};

void f1(B1 &b1, B1 &b2)
{
    b1 = b2;
}