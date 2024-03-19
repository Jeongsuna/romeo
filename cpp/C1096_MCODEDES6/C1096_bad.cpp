#include <iostream>
#include <cstdint>

int main() {
   // Non-compliant :: parameter
   void fn(int b);

   // Non-compliant :: var Decl type
   int a = 3;

   // Non-compliant :: return type
   int fn2(int16_t c);

   return 0;
}
