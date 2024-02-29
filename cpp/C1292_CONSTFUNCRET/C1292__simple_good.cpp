#include <iostream>

class C 
{ 
public: 
    C(int32_t &b_) : a(new int32_t[10]), b(b_)
    { 
    }
    // Compliant
    const int32_t *getC() const
    { 
        return a; 
    }
    // Compliant
    const int32_t *getD() const
    { 
        return &b; 
    }
private: 
    int32_t *a; 
    int32_t &b; 
};

int main(void){return 0;}