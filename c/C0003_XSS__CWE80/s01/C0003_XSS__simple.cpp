#include <iostream>

void cgiFromString(const char input[], char data[], int date_size) {
    printf("%c", &data);
}

int XSS(int argc, char* argv[]) {
    unsigned int i = 0;
    char data[1024];
    FILE* cgiOut;
    cgiOut = fopen("cgiOut.log", "r");

    //cgiFromString 으로 받아온 사용자 입력값이 검증 없이 화면에 출력됩니다
    cgiFromString("user input", data, sizeof(data));
    fprintf(cgiOut, "Print user input = %s</br>", data);

    fprintf(cgiOut, "</body></html>￦n");
    fclose(cgiOut);
    return 0;
}