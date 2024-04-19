#include <stdio.h>
#include <ctime>

int main() {

    // 1. 현재 시각 (초 단위)
    time_t current_time = time(NULL);
    printf("현재 시각 (초 단위): %ld\n", current_time);

    // 2. CPU 사용 시간 (밀리초 단위)
    clock_t start_cpu_time = clock();
    // ... 작업 수행 ...
    clock_t end_cpu_time = clock();
    double cpu_time = (double)(end_cpu_time - start_cpu_time) / CLOCKS_PER_SEC;
    printf("CPU 사용 시간 (밀리초 단위): %.2f\n", cpu_time);

    // 3. 현재 시각 (문자열)
    char *ctime_time = ctime(&current_time);
    printf("현재 시각 (문자열): %s\n", ctime_time);

    // 4. 현재 시각 (UTC 기준)
    struct tm *utc_time = gmtime(&current_time);
    printf("년도 (UTC): %d\n", utc_time->tm_year + 1900);
    printf("월 (UTC): %d\n", utc_time->tm_mon + 1);
    printf("일 (UTC): %d\n", utc_time->tm_mday);
    printf("시 (UTC): %d\n", utc_time->tm_hour);
    printf("분 (UTC): %d\n", utc_time->tm_min);
    printf("초 (UTC): %d\n", utc_time->tm_sec);

    // 5. 현재 시각 (문자열, 로케일 설정 무시)
    char *asctime_time = asctime(localtime(&current_time));
    printf("현재 시각 (문자열, 로케일 설정 무시): %s\n", asctime_time);

    // 6. 현재 시각 (문자열, 로케일 설정 반영)
    struct tm *local_time = localtime(&current_time);
    char buffer[80];
    strftime(buffer, sizeof(buffer), "%Y-%m-%d %H:%M:%S", local_time);
    printf("현재 시각 (문자열, 로케일 설정 반영): %s\n", buffer);

    // 7. 문자열을 시간 구조체로 변환
    char str[] = "2024-02-23 16:20:00";
    struct tm time_info;
    strptime(str, "%Y-%m-%d %H:%M:%S", &time_info);
    printf("년도: %d\n", time_info.tm_year + 1900);
    printf("월: %d\n", time_info.tm_mon + 1);
    printf("일: %d\n", time_info.tm_mday);
    printf("시: %d\n", time_info.tm_hour);
    printf("분: %d\n", time_info.tm_min);
    printf("초: %d\n", time_info.tm_sec);

    // 8. 두 시간의 차이 계산
    time_t start_time = time(NULL);
    // ... 작업 수행 ...
    time_t end_time = time(NULL);
    double time_diff = difftime(end_time, start_time);
    printf("두 시간의 차이 (초 단위): %.2f\n", time_diff);

    // 9. 시간 구조체를 time_t 값으로 변환
    time_t mktime_time = mktime(&time_info);
    printf("time_t 값: %ld\n", mktime_time);

    // 10. 시간대 정보 설정
    tzset();
    printf("현재 시간대: %s\n", tzname[0]);

    return 0;
}