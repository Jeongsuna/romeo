#include <iostream>

class A 
{ 
public: 
    explicit A( int32_t x ) : m_x(x) { } 
    void print() const { std::cout << "Value: " << m_x << std::endl; }
private:
    int32_t m_x;
};

int32_t g ( ) 
{
    return 7; 
}

void f ( ) 
{ 
    A const a1 = A( 10 ); // Compliant 
    A * a2 = ( A* )( &a1 ); // Non-compliant 
    A * a3 = const_cast<A*>( &a1 ); // Compliant, but breaks Rule 5–2–5 
    (void)g ( ); 
}

int main() {
    f();
    return 0;
}
