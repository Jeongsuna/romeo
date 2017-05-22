size_t strlen(char const* _Str);
char* strcpy(char* __dest, const char* __src);
char* strcat(char* __dest, const char* __src);
char * strncat ( char * destination, const char * source, size_t num );
void* memcpy(void* __dest, const void* __src, size_t __n);
void* memset(void* __s, int __c, size_t __n);

inline char* strchr(char* const _String, int const _Ch);