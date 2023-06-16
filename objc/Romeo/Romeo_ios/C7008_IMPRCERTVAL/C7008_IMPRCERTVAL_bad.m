//
//  C7008_IMPRCERTVAL_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/15.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#include <curl/curl.h>
#include <openssl/ssl.h>
#include <botan/tls_client.h>
#include <botan/tls_callbacks.h>
#include <botan/tls_session_manager.h>
#include <botan/tls_policy.h>
#include <botan/auto_rng.h>
#include <botan/certstor.h>
#include <botan/certstor_system.h>

static int verify_callback(int preverify_ok, X509_STORE_CTX *ctx) { return 1; }


void bad_libcurl(int argc, const char * argv[]) {
    
        CURL *curl;
        CURLcode res;

        curl_global_init(CURL_GLOBAL_DEFAULT);

        curl = curl_easy_init();
        if(curl) {
            curl_easy_setopt(curl, CURLOPT_URL, "https://example.com/");
            curl_easy_setopt(curl, CURLOPT_SSL_VERIFYPEER, 0L); // Noncompliant;

            res = curl_easy_perform(curl);
            if(res != CURLE_OK) {
                fprintf(stderr, "curl_easy_perform() failed: %s\n", curl_easy_strerror(res));
            }

            curl_easy_cleanup(curl);
        }
        
        curl_global_cleanup();
    
}

void bad_openssl1(int argc, const char * argv[]){

    const SSL_METHOD *method = TLS_method();
    SSL_CTX *ctx = SSL_CTX_new(method);

    SSL_CTX_set_verify(ctx, SSL_VERIFY_NONE, NULL); // Noncompliant

    SSL *ssl = SSL_new(ctx);

    SSL_connect(ssl);
}

void bad_openss2(int argc, const char * argv[]){

    const SSL_METHOD *method = TLS_method();
    SSL_CTX *ctx = SSL_CTX_new(method);

    SSL_CTX_set_verify(ctx, CURLOPT_SSL_VERIFYPEER, verify_callback); // Noncompliant

    SSL *ssl = SSL_new(ctx);

    SSL_connect(ssl);
}


