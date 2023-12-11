#include <stdint.h>

struct S 
{ 
    int i : 2; // Non-compliant 
    char c : 2; // Non-compliant 
    long l : 2; // Non-compliant 
    short f : 2; // Non-compliant 
    wchar_t k : 2; // Non-compliant 
};

int main() {
    return 0;
}