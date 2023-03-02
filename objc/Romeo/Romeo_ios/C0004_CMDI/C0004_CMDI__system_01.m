#include <stdio.h>
#include <stdlib.h>

int main() {
    // Flaw:
    system("ls");
    return 0;
}
