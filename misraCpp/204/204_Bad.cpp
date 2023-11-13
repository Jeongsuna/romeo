// file.cpp
#define A

#ifdef A

#include "file1.hpp"
#
#endif

#if 1
#include "file2.hpp"


// file1.hpp
#if 1

#endif // Compliant


// file2.hpp

#endif // Non-compliant

int main(void){return 0;}