#include <iostream>
#include <cstdint>

int main() {
   void fn(int16_t b2); // compliant :: parameter

   int16_t a2 = 3; // compliant :: var Decl type

   int16_t fn2(int16_t c2); // compliant :: return type

   return 0;
}
