#include <iostream>

template <typename T> 
class A 
{ 
public: 
    template <int i> 
    void f2() {
        std::cout << "Function f2<" << i << "> called\n";
    }; 
};

void f(A<int>* a[10]) // Compliant
{ 
    a[0]->f2<20>(); // Compliant
}

int main() {
    A<int>* a[10];
    a[0] = new A<int>();
    f(a);
    delete a[0];
    return 0;
}
