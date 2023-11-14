// tmpl.h 
template <typename T> void bad_tmpl() {}
template <typename T> void good_tmpl() {} 
template <> void good_tmpl<int32_t>() {}
// tmpl.cc 
#include "tmpl.h" 
// bad_tmpl 템플릿의 선언이 tmpl.h 파일에 있고 bad_tmpl의 명시적 특수화는 tmpl.cc 에있습니다.(비준수)
template <> void bad_tmpl<int32_t>() {}
template <> void good_tmpl<int32_t>() {}
// f.cc 
#include <tmpl.h>
void f() 
{ 
    bad_tmpl<int32_t>();  
    good_tmpl<int32_t>(); 
}