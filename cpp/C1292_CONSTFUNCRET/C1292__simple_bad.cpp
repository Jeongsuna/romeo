#include <iostream>

class C1292_1 
{ 
public: 
    C1292_1(int32_t &b_) : a(new int32_t[10]), b(b_)
    { 
    }
    // Non-Complaint
    int32_t *getA() const
    { 
        return a; 
    }
    // Non-Complaint
    int32_t *getB() const
    { 
        return &b; 
    }
private: 
    int32_t *a; 
    int32_t &b; 
};

int main(void){return 0;}