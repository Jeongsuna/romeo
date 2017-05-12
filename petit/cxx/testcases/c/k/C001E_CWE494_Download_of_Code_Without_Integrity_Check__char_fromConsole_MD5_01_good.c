/*
Filename : C001E_CWE494_Download_of_Code_Without_Integrity_Check__char_fromConsole_MD5_01_good.c
*/


#include "std_testcase.h"

#include <openssl/md5.h>
#include <stdio.h>
#include <curl/curl.h>
#include <curl/easy.h>
#include <string.h>
#pragma comment(lib, "advapi32.lib")
#pragma comment(lib, "user32.lib")

#ifndef OMITGOOD

size_t write_data(void *ptr, size_t size, size_t nmemb, FILE *stream)
{
	size_t written = fwrite(ptr, size, nmemb, stream);
	return written;
}

static void goodB2G()
{
	CURL *curl;
	CURLcode res;
	unsigned char c[MD5_DIGEST_LENGTH];
	char * serverfile = "http://192.168.0.100/";
	char * serverhash = "http://192.168.0.100/hash.txt";
	char * hash;
	char * tobedownloaded;
	char * hashfromFile;
	char * url;
	char filePath[FILENAME_MAX] = "c:\\download.txt";
	char hashPath[FILENAME_MAX] = "c:\\hash.txt";
	int i;
	FILE * downloadFile;
	FILE * hashFile;
	MD5_CTX mdContext;
	int bytes;
	unsigned char buf[1024];
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

	//get hash from the file with MD5 algorithm
	MD5_Init (&mdContext);
	while((bytes = fread(buf, 1, 1024, downloadFile)) != 0)
	{
		MD5_Update (&mdContext, buf, bytes);
	}
	MD5_Final (c,&mdContext);

	//convert to hex and store into hashfromFile
	for(i=0;i<MD5_DIGEST_LENGTH;i++)
	{
		printf("%02x", c[i]);
		strcat(hashfromFile,(char*)c[i]);
	}
	printf(" %s\n", filePath);
	

	//download text file that has hash
	curl = curl_easy_init();
	if(curl)
	{
		hashFile = fopen(hashPath, "wb");
		curl_easy_setopt(curl, CURLOPT_URL, serverhash);
		curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_data);
		curl_easy_setopt(curl, CURLOPT_WRITEDATA, hashFile);
		res = curl_easy_perform(curl);
		//fclose(downloadFile);
	}

	//get the hash from the text file
	if (fgets(hash, 16, hashFile) == NULL)
    {
        printLine("fgets failed!");
		fclose(hashFile);
        exit(1);
    }
    printLine(hash);
	
	/* FIX */
	//if hash matches, get data from the file. Otherwise, delete the file
	if(strcmp(hashfromFile,hash) == 0)
	{
		if (fgets(data, 100, downloadFile) == NULL)
		{
			printLine("fgets failed!");
			fclose(hashFile);
			fclose(downloadFile);
			exit(1);
		}
		printLine(data);
	}
	else
	{
		printLine("Hash doesn't match");
		if(remove(filePath) == -1)
		{
			printLine("Failed to delete the text file");
		}
		if(remove(hashPath) == -1)
		{
			printLine("Failed to delete the hash file");
		}
	}
	fclose(hashFile);
	fclose(downloadFile);

}

void C001E_CWE494_Download_of_Code_Without_Integrity_Check__char_fromConsole_MD5_01_good()
{

    goodB2G();
}

#endif /* OMITGOOD */

/* Below is the main(). It is only used when building this testcase on
   its own for testing or for building a binary to use in testing binary
   analysis tools. It is not used when compiling all the testcases as one
   application, which is how source code analysis tools are tested. */

#ifdef INCLUDEMAIN

int main(int argc, char * argv[])
{
    /* seed randomness */
    srand( (unsigned)time(NULL) );
#ifndef OMITGOOD
    printLine("Calling good()...");
    C001E_CWE494_Download_of_Code_Without_Integrity_Check__char_fromConsole_MD5_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
