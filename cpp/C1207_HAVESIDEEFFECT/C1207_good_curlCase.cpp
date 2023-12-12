#include <curl.h>
#include <iostream>

void send_request() {
    CURL* curl;
    CURLcode res;

    curl_global_init(CURL_GLOBAL_DEFAULT);

    curl = curl_easy_init();
    if(curl) {
        curl_easy_setopt(curl, CURLOPT_URL, "http://example.com");

        res = curl_easy_perform(curl);

        if(res != CURLE_OK)
            std::cout << "curl_easy_perform() failed: " << curl_easy_strerror(res);

        curl_easy_cleanup(curl);
    }

    curl_global_cleanup();
}