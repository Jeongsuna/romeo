#include <arm64_neon.h>

int16_t x;

int main()
{
    switch (x)
    {
    case 0:
        ++x;
        break;
    case 1:
    case 2:
        break;
        /* Non-compliant - default label is required */
    }

    enum Colours
    {
        RED, GREEN, BLUE
    }colour = RED;

    enum Colours next;
 

    switch (colour)
    {
    case RED:
        next = GREEN;
        break;
    case GREEN:
        next = BLUE;
        break;
    case BLUE:
        next = RED;
        break;
        /* Non-compliant - no default label.
         * Even though all values of the enumeration are
         * handled there is no guarantee that colour takes
         * one of those values */
    }

    return 0;
}