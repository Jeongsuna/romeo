#include <stdio.h>

int main() {
    FILE *fp = fopen("test.txt", "w");
    if (fp != NULL) {
        // FILE 객체에 대한 포인터를 역참조하지 않고, 표준 라이브러리 함수를 사용합니다.
        fputs("Hello, World!", fp);
        fclose(fp);
    }
    return 0;
}
