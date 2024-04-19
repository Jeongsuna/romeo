#include <cstdint>

class V_1
{
public:
    V_1()
    {
    }
    V_1(int32_t i)
    {
    }
};
class C1_1 : public virtual V_1
{
public:
    C1_1() : V_1(21)
    {
    }
};
class C2_1 : public virtual V_1
{
public:
    C2_1() : V_1(42)
    {
    }
};
class D_1 : public C1_1, public C2_1
{
public:
    D_1()
    {
    }
};