#include <cstdlib>
#include <cerrno>

void f1 ( const char * str )
{
    errno = 0;  // Non-compliant
    int32_t i = atoi ( str );

    if ( 0 != errno )   //Non-compliant
    {
        // handle error case???
    }
}

int main()
{
    return 0;
}
