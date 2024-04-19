#include <typeinfo>
class B2 {
public:
  virtual ~B2() {}
  virtual void foo();

  B2() {
    typeid(B2); // 위반 사례: B2는 다형적 (polymorphic)
    B2::foo();  // 허용: 가상 호출 X
    foo();      // 위반 사례: 가상 호출
    dynamic_cast<B2*>(this); // 위반 사례: dynamic_cast 사용
  }
};