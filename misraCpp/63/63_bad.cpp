#include <iostream>
#include <cstdint>

using namespace std;

void f1 ( ) 
{ 
    int16_t s16a = 10; 
    int16_t s16b = 2; 
    float f32a;
    // The following performs integer division 
    f32a = static_cast< float > ( s16a / s16b ); // Non-compliant
    cout << "The result is: " << f32a << endl;
}

int main() {
    f1();
    return 0;
}
