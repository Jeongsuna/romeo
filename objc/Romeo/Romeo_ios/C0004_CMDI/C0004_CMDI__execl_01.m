#include <unistd.h>

int main() {
    // Flaw:
    execl("/bin/ls", "ls", "-l", NULL);

    return 0;
}
