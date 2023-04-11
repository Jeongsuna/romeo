#include <string.h>

void initialize(char *array) {
    memset(array, 0, 10);
}

int good() {
    char array[10];
    initialize(array);
    void *pos = memchr(array, '@', 10); // Noncompliant
    return 0;
}

