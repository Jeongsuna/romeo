#include <iostream>

class A 
{ 
public: 
    explicit A( int32_t value ) : m_value(value) {} 
    void print() const { std::cout << "Value: " << m_value << std::endl; }
private:
    int32_t m_value;
};

int32_t g ( ) 
{
    return 7; 
}

void f ( ) 
{ 
    A const a1 = A( 10 ); // Compliant 
    A * a2 = static_cast<A*>(const_cast<A*>(&a1)); // Compliant
    A * a3 = const_cast<A*>( &a1 ); // Compliant, but breaks Rule 5–2–5 
    (void)g ( );
}

int main()
{
    f();
    return 0;
}
