//파일 권한 : rw-rw-rw-, 디렉터리 권한 : rwxrwxrwx
// 파일 생성시 가장 많은 권한을 허가하는 형태로 umask(0)를 사용하고 있다.
#include <stdio.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>
#include  <unistd.h>

void C0012_WRONGPERM() {
	umask(0);
	FILE* out = fopen("important_file", "w");
	if (out) {
		fprintf(out, "민감한 정보\n");
		fclose(out);
	}
}
