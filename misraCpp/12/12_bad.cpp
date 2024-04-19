#include <cstdint>

class A 
{ 
public: 
    virtual void withunusedpara(uint16_t* para1, int16_t unusedpara) = 0; 
    virtual void withoutunusedpara(uint16_t* para1, int16_t& para2) = 0; 
};

class B1: public A 
{ 
public: 
    virtual void withunusedpara(uint16_t* para1, int16_t unusedpara) override
    { 
        *para1 = 1U; 
    }
    virtual void withoutunusedpara(uint16_t* para1, int16_t& para2) override
    { 
        *para1 = 1U; 
    } 
};

class B2: public A 
{ 
public: 
    virtual void withunusedpara(uint16_t* para1, int16_t unusedpara) override
    { 
        *para1 = 1U; 
    }
    virtual void withoutunusedpara(uint16_t* para1, int16_t& para2) override
    { 
        para2 = 0; 
    } 
};

int main() {
    B1 b1;
    B2 b2;
    uint16_t para1 = 0;
    int16_t para2 = 0;

    b1.withunusedpara(&para1, para2);
    b1.withoutunusedpara(&para1, para2);

    b2.withunusedpara(&para1, para2);
    b2.withoutunusedpara(&para1, para2);

    return 0;
}
