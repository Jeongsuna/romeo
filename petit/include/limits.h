#define CHAR_BIT      8         // number of bits in a char
#define SCHAR_MIN   (-128)      // minimum signed char value
#define SCHAR_MAX     127       // maximum signed char value
#define UCHAR_MAX     0xff      // maximum unsigned char value

#ifndef _CHAR_UNSIGNED
    #define CHAR_MIN    SCHAR_MIN   // mimimum char value
    #define CHAR_MAX    SCHAR_MAX   // maximum char value
#else
    #define CHAR_MIN    0
    #define CHAR_MAX    UCHAR_MAX
#endif