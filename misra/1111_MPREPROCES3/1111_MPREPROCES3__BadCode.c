// #include another.h        /* Non-compliant */

#define FILENAME file2.h
// #include FILENAME         /* Non-compliant */

#define BASE "base"
#define EXT ".ext"
// #include BASE EXT         /* Non-compliant - string are concatenated after preprocessing */

int fake_main()
{
	return 0;
}