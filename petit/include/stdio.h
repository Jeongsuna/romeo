#ifndef __STDIO_H
#define __STDIO_H

#define EOF (-1)

#define FILENAME_MAX    260

typedef struct File {} FILE;

FILE* stdin;
FILE* stdout;
FILE* stderr;

extern FILE *fopen (const char* __filename, const char* __modes);
extern int fclose (FILE* __stream);
extern size_t fwrite(const void* __ptr, size_t __size, size_t __n, FILE* __s);
#ifdef __cplusplus
extern size_t fwrite(const void* __ptr, size_t __size, size_t __n, int __s);
#endif
extern char* fgets(char* __s, int __n, FILE* __stream);
extern int fscanf(FILE* __stream, const char* __format, ...);
extern int sprintf(char* __s, const char* __format, ...);
extern int printf(const char* __format, ...);

int _snprintf(char* const _Buffer, size_t const _BufferCount, char const* const _Format, ...);

int fprintf ( FILE * stream, const char * format, ... );

#endif
