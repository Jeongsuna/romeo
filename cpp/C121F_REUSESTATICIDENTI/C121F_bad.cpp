#include <iostream>

namespace NS1 
{ 
    static int32_t global = 0; 
}

namespace NS2 
{ 
    void fn ( ) 
    { 
        int32_t global; // Non-compliant 
    } 
}

int main()
{
    NS1::global = 5;
    NS2::fn();
    std::cout << "The value of global in NS1 is: " << NS1::global << std::endl;
    return 0;
}
