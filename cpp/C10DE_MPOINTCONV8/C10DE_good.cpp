#include <iostream>

typedef char char_t;

void f ( char_t * p ) 
{ 
    *p = '\0'; 
}

int main ( ) 
{ 
    char_t str[] = "Hello World!";
    f ( str ); 
    std::cout << str << std::endl;
    return 0;
}
