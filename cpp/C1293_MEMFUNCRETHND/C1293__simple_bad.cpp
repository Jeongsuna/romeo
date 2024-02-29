#include <iostream>

class C
{
public:
    int32_t& getA()
    {
        return a;
    }

private:
    int32_t a;
};

void b(C& c)
{
    int32_t& a_ref = c.getA();
    a_ref = 10; 
}

int main(void){return 0;}