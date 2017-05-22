#define EXIT_SUCCESS 0
#define EXIT_FAILURE 1

void exit(int _Code);
	
double    atof   (char const* _String);
int       atoi   (char const* _String);
long      atol   (char const* _String);
long long atoll  (char const* _String);
__int64   _atoi64(char const* _String);

unsigned long strtoul(char const* _String, char** _EndPtr, int _Radix);
extern void* malloc(size_t __size);
extern void* calloc (size_t __nmemb, size_t __size);
extern void free(void *__ptr);

extern int rand (void);
extern void srand (unsigned int __seed);
extern char* getenv (const char* name);