#include <cstdlib>
#include <cerrno>

void f1 ( const char * str )
{
    // Non-compliant
    errno = 0;
    int32_t i = atoi ( str );

    //Non-compliant
    if ( 0 != errno )
    {
        // handle error case
    }
}

int main()
{
    return 0;
}
