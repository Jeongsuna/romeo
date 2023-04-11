#include <string.h>

void initialize(char *array) {
    memset(array, 0, 10);
}

int bad() {
    char array[10];
    initialize(array);
    void *pos = memchr(array, '@', 42); // Noncompliant
    return 0;
}
