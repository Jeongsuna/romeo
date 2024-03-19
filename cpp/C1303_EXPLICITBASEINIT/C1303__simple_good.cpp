#include <cstdint>

class V_2
{
public:
    V_2()
    {
    }
    V_2(int32_t i)
    {
    }
};
class C1_2 : public virtual V_2
{
public:
    C1_2() : V_2(21)
    {
    }
};
class C2_2 : public virtual V_2
{
public:
    C2_2() : V_2(42)
    {
    }
};
class D_2 : public C1_2, public C2_2
{
public:
    D_2() : V_2(), C1_2(), C2_2()
    {
    }
};