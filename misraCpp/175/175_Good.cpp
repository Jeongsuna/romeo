// tmpl.h 
// 템플릿에 대한 모든 부분 및 명시적 전문화는 기본 템플릿의 선언과 동일한 파일로 선언되어야 합니다.(준수)
template <typename T> void bad_tmpl () {}
template <typename T> void good_tmpl () {} 
template <> void good_tmpl<int32_t> () {}
// bad_tmpl의 명시적 특수화를 추가했습니다.
template <> void bad_tmpl<int32_t> ();

// f.cc 
#include "tmpl.h"
void f () 
{ 
    bad_tmpl<int32_t> (); 
    good_tmpl<int32_t> ();
}