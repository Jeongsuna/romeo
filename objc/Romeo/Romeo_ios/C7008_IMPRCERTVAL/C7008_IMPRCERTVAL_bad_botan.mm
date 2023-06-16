//
//  C7008_IMPRCERTVAL_bad_botan.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/15.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <botan/tls_client.h>
#import <botan/tls_callbacks.h>
#import <botan/tls_session_manager.h>
#import <botan/tls_policy.h>
#import <botan/auto_rng.h>
#import <botan/certstor.h>
#import <botan/certstor_system.h>
#include <iostream>
#include <vector>
#include <optional>
#include <chrono>


class Callbacks : public Botan::TLS::Callbacks
{
    virtual void tls_verify_cert_chain(
       const std::vector<Botan::X509_Certificate>& cert_chain,
       const std::vector<optional<Botan::OCSP::Response>>& ocsp_responses,
       const std::vector<Botan::Certificate_Store*>& trusted_roots,
       Botan::Usage_Type usage,
       std::string_view hostname,
       const Botan::TLS::Policy& policy) override{
           
        } // Noncompliant

};

// Client_Credentials 클래스를 정의합니다.
class Client_Credentials : public Botan::Credentials_Manager
{
    // ...
};


void bad_botan(int argc, const char * argv[]) {
    
        // 콜백 및 각종 Botan TLS 객체를 초기화합니다.
        Callbacks callbacks;
        Botan::AutoSeeded_RNG rng;
        Botan::TLS::Session_Manager session_mgr(rng);
        Client_Credentials creds;
        Botan::TLS::Strict_Policy policy;

        // TLS 연결을 엽니다.
        Botan::TLS::Client client(callbacks, session_mgr, creds, policy, rng,
                                 Botan::TLS::Server_Information("example.com", 443),
                          
                                  Botan::TLS::Protocol_Version::TLS_V12); // Noncompliant
    }

void good_botan(int argc, const char * argv[]){
    Callbacks callbacks;
    Botan::AutoSeeded_RNG rng;
    Botan::TLS::Session_Manager_In_Memory session_mgr(rng);
    Client_Credentials creds;
    Botan::TLS::Strict_Policy policy;

    // open the tls connection
    Botan::TLS::Client client(callbacks, session_mgr, creds, policy, rng,
                              Botan::TLS::Server_Information("example.com", 443),
                              Botan::TLS::Protocol_Version::TLS_V12); // Compliant;
}

