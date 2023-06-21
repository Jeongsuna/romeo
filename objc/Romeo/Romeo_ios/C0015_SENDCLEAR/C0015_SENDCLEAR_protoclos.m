//
//  C0015_SENDCLEAR_protoclos.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/19.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#include <curl/curl.h>

void bad() {
    char* http_url = "http://example.com";
    char* ftp_url = "ftp://anonymous@example.com";
    char* telnet_url = "telnet://anonymous@example.com";

    CURL *curl_ftp = curl_easy_init();
    curl_easy_setopt(curl_ftp, CURLOPT_URL, ftp_url); // Sensitive

    CURL *curl_smtp = curl_easy_init();
    curl_easy_setopt(curl_smtp, CURLOPT_URL, "smtp://example.com:587"); // Sensitive
    
    CURL *curl_telnet = curl_easy_init();
    curl_easy_setopt(curl_telnet, CURLOPT_URL, telnet_url); // Sensitive

}

void good() {
    
    char* https_url = "https://example.com";
    char* sftp_url = "sftp://anonymous@example.com";
    char* ssh_url = "ssh://anonymous@example.com";
    
    CURL *curl_ftps = curl_easy_init();
    curl_easy_setopt(curl_ftps, CURLOPT_URL, "ftp://example.com/");
    curl_easy_setopt(curl_ftps, CURLOPT_USE_SSL, CURLUSESSL_ALL); //    Compliant
    
    CURL *curl_smtp_tls = curl_easy_init();
    curl_easy_setopt(curl_smtp_tls, CURLOPT_URL, "smtp://example.com:587");
    curl_easy_setopt(curl_smtp_tls, CURLOPT_USE_SSL, CURLUSESSL_ALL); // Compliant
    
    CURL *curl_https = curl_easy_init();
    curl_easy_setopt(curl_https, CURLOPT_URL, https_url);    // Compliant
    
    CURL *curl_sftp = curl_easy_init();
    curl_easy_setopt(curl_https, CURLOPT_URL, sftp_url);    // Compliant
    
    CURL *curl_ssh = curl_easy_init();
    curl_easy_setopt(curl_https, CURLOPT_URL, "ssh://anonymous@example.com");    // Compliant
}

