#include <iostream>
#include <typeinfo>

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

    // Compliant - defined behaviour 
    D *pD = dynamic_cast<D*>(pB); 

    if(pD != nullptr) {
        pD->print();
    } else {
        std::cout << "Downcasting failed." << std::endl;
    }

    // Compliant, but pD2 may be NULL 
    D *pD2 = dynamic_cast<D*>(pB); 

    if(pD2 != nullptr) {
        pD2->print();
    } else {
        std::cout << "Downcasting failed." << std::endl;
    }

    // Compliant, but may throw an exception
    try {
        D &D3 = dynamic_cast<D&>(*pB);
        D3.print();
    } catch (std::bad_cast& bc) {
        std::cerr << "bad_cast caught: " << bc.what() << '\n';
    }
    
    return 0;
}
