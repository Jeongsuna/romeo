extern char *cgiServerName;
extern char *cgiScriptName;
extern FILE *cgiOut;

typedef enum {
	cgiFormSuccess,
	cgiFormTruncated,
	cgiFormBadType,
	cgiFormEmpty,
	cgiFormNotFound,
	cgiFormConstrained,
	cgiFormNoSuchChoice,
	cgiFormMemory,
	cgiFormNoFileName,
	cgiFormNoContentType,
	cgiFormNotAFile,
	cgiFormOpenFailed,
	cgiFormIO,
	cgiFormEOF
} cgiFormResultType;

extern cgiFormResultType cgiFormString(char *name, char *result, int max);
extern void cgiHeaderCookieSetString(char *name, char *value, int secondsToLive, char *path, char *domain);