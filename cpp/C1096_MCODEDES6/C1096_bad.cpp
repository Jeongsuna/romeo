#include <iostream>
#include <cstdint>

int main() {
   void fn(int b); // Non-compliant :: parameter

   int a = 3; // Non-compliant :: var Decl type

   int fn2(int16_t c); // Non-compliant :: return type

   return 0;
}
