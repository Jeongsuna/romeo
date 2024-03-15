#include <iostream>
#include <cstdint>

int main() {
   // compliant :: parameter
   void fn(int16_t b2);
   
   // compliant :: var Decl type
   int16_t a2 = 3;

   // compliant :: return type
   int16_t fn2(int16_t c2);

   return 0;
}
