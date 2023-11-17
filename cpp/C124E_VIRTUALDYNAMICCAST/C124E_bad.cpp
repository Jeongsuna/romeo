#include <iostream>

class B {
public:
    virtual void print() {
        std::cout << "This is class B." << std::endl;
    }
};

class D: public virtual B {
public:
    void print() override {
        std::cout << "This is class D." << std::endl;
    }
};

int main() {
    D d; 
    B *pB = &d; 

    // Non-compliant - undefined behaviour 
    D *pD = static_cast<D*>(pB); 

    pD->print();
    
    return 0;
}
