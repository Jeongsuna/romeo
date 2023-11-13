// The following are compliant 
#define STOR extern // storage class specifier 
 // Breaks Rule 16–2–1
// The following are non-compliant 
#define CLOCK (xtal/16) // Constant expression 
#define PLUS2(X) ((X) + 2) // Macro expanding to expression 
#define PI 3.14159F // use const object instead 
#define int32_t long // use typedef instead 
#define STARTIF if( // language redefinition 
#define INIT(value) {(value), 0, 0} // braced initializer 
#define HEADER "filename.h" // string literal