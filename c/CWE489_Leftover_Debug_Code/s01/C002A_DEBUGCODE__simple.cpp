#include <iostream>

#define buffer 1000

//vlop
int backtrace(int buffer_size, int back_size) {
	return buffer_size / back_size;
}

char** backtrace_symbols(int buffer_size, int nptrs) {
	char back1[] = "backtrace_symbol";
	char* back2 = back1;
	char** back3 = &back2;
	
	return back3;
}

void LeftoverDebugCode() {
	int i, j = 0, nptrs;
	char** strings;
	bool debug = false;

	nptrs = backtrace(buffer, 100);
	strings = backtrace_symbols(buffer, nptrs);
		//디버그 모드일 시 콜스택을 출력한다.
		if (debug) {
			for (i = 0; i < nptrs; i++)
				printf("%s\n", strings[j]);
		}
}
