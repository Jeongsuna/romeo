#include <stdio.h>

int main() {
    FILE *fp = fopen("test.txt", "w");
    if (fp != NULL) {
        fp->_flags = 0;  // MISRA C 2012 Rule 22.5 위반
        fclose(fp);
    }
    return 0;
}
