#include <iostream>

namespace NS1 
{ 
    static int32_t global_ns1 = 0; 
}

namespace NS2 
{ 
    void fn ( ) 
    { 
        int32_t local_ns2; // Compliant 
    } 
}

int main()
{
    NS1::global_ns1 = 5;
    NS2::fn();
    std::cout << "The value of global_ns1 is: " << NS1::global_ns1 << std::endl;
    return 0;
}
