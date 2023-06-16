//
//  C7008_IMPRCERTVAL_good.m
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


void good_libcurl(int argc, const char * argv[]) {
    
    CURL *curl;
    curl_global_init(CURL_GLOBAL_DEFAULT);

    curl = curl_easy_init();
    curl_easy_setopt(curl, CURLOPT_URL, "https://example.com/");
    curl_easy_setopt(curl, CURLOPT_SSL_VERIFYPEER, 1L); // Compliant

    //Perform the request
    curl_easy_perform(curl);
    
}

void good_openssl1(int argc, const char * argv[]){
    
    const SSL_METHOD *method = TLS_method();
    SSL_CTX *ctx = SSL_CTX_new(method);

    SSL_CTX_set_verify(ctx, SSL_VERIFY_PEER, NULL); // Compliant;

    SSL *ssl = SSL_new(ctx);

    SSL_connect(ssl);
}



