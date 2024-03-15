#include <cstdint>

class B2 {
public:
    B2();
    virtual void f() = 0;
    int32_t getKind() const { return kind; }

protected:
    // Protected copy assignment operator
    B2& operator=(const B2& rhs); 

private:
    int32_t kind;
};

class D2 : public B2 {
public:
    virtual void f() {}

    // Derived class implements copy assignment
    D2& operator=(const D2& rhs); 


private:
    int32_t member;
};

// Function cannot call B2's copy assignment operator (compiler error)
void f2(B2& b1, B2& b2) {
    // This would cause a compiler error
    // b1 = b2; 
}