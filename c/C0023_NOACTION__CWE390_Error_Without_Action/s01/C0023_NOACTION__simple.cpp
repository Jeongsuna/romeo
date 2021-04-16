#include <iostream>

void Error_Without_Action__char_fputs_char_fputs_0101_bad() {
	{
		// 오류 검사를 한 후 아무런 조치를 하지 않아 프로그램에서 어떤 일이 일어났는지 전혀 알 수 없다.
		if (fputs("string", stdout) == EOF) {
			// 아무 조치를 하지 않음.
		}
	}
}
