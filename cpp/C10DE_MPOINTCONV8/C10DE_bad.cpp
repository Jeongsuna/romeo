#include <iostream>

typedef char char_t;

void f ( const char_t * p ) 
{ 
    *const_cast< char_t * >( p ) = '\0'; // Non-compliant 
}

int main ( ) 
{ 
    char str[] = "Hello World!";
    f (str);
    std::cout << str << std::endl;
    return 0;
}
