/*
Filename : C001E_CWE494_Download_of_Code_Without_Integrity_Check__char_fromConsole_MD5_01_bad.c
*/


#include "std_testcase.h"


#include <stdio.h>
#include <curl/curl.h>
#include <curl/easy.h>
#include <string.h>

#pragma comment(lib, "advapi32.lib")
#pragma comment(lib, "user32.lib")




#ifndef OMITBAD


size_t write_data(void *ptr, size_t size, size_t nmemb, FILE *stream)
{
	size_t written = fwrite(ptr, size, nmemb, stream);
	return written;
}

void C001E_CWE494_Download_of_Code_Without_Integrity_Check__char_fromConsole_MD5_01_bad()
{
	char * serverfile = "http://192.168.0.100/";
	char * tobedownloaded;
	char * url;
	char filePath[FILENAME_MAX] = "c:\\download.txt";
	FILE * downloadFile;
	CURL *curl;
	CURLcode res;
    char * data;
    char data_buf[100] = "";
    data = data_buf;
    {
        /* Read input from the console */
        size_t data_len = strlen(data);
        /* if there is room in data, read into it from the console */
        if(100-data_len > 1)
        {
            if (fgets(data+data_len, (int)(100-data_len), stdin) != NULL)
            {
                /* The next 3 lines remove the carriage return from the string that is
                 * inserted by fgets() */
                data_len = strlen(data);
                if (data_len > 0 && data[data_len-1] == '\n')
                 {
                    data[data_len-1] = '\0';
                }
            }
            else
            {
                printLine("fgets() failed");
                /* Restore NUL terminator if fgets fails */
                data[data_len] = '\0';
            }
        }
    }

    {
		//get the file path from the server
		strcat(serverfile,data);

		//download file from the server (if not exists, create one)
		curl = curl_easy_init();
		if(curl)
		{
			downloadFile = fopen(filePath, "wb");
			if(downloadFile == NULL)
			{
				printf("%s can't be opened.\n", filePath);
				exit(1);
			}
			curl_easy_setopt(curl, CURLOPT_URL, serverfile);
			curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_data);
			curl_easy_setopt(curl, CURLOPT_WRITEDATA, downloadFile);
			res = curl_easy_perform(curl);
		}

		/* FLAW: getting the data from the file without checking integrity */
		if (fgets(data, 100, downloadFile) == NULL)
		{
			printLine("fgets failed!");
			exit(1);
		}
		printLine(data);
		fclose(downloadFile);
    }

}

#endif /* OMITBAD */


/* Below is the main(). It is only used when building this testcase on
   its own for testing or for building a binary to use in testing binary
   analysis tools. It is not used when compiling all the testcases as one
   application, which is how source code analysis tools are tested. */

#ifdef INCLUDEMAIN

int main(int argc, char * argv[])
{
    /* seed randomness */
    srand( (unsigned)time(NULL) );
#ifndef OMITBAD
    printLine("Calling bad()...");
    C001E_CWE494_Download_of_Code_Without_Integrity_Check__char_fromConsole_MD5_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
