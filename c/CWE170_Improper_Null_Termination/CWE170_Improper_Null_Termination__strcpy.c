#include <string.h>
#include <fcntl.h>
#include <unistd.h>

#define MAXLEN 1024

void bad() {
	int fd;
	char pathbuf[MAXLEN];
	char buff[MAXLEN];
	
	if (( fd = open( "file.txt", O_RDONLY)) > 0) {
		int size = read(fd, buff, MAXLEN); //does not null terminate
		if(size > 0) {
			strcpy(pathbuf,buff); //requires null terminated input
		}
		close(fd);
	}
}	

void good() {
	int fd;
	char pathbuf[MAXLEN];
	char buff[MAXLEN];
	
	if (( fd = open( "file.txt", O_RDONLY)) > 0) {
		int size = read(fd, buff, MAXLEN); //does not null terminate
		if(size > 0) {
			buff[size - 1] = '\0';
			strcpy(pathbuf,buff); //requires null terminated input
		}
		close(fd);
	}
}
