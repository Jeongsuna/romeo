#include <typeinfo>
class B1 {
public:
  B1() {
    typeid(B1); // 허용: B1은 다형적이 X
  }
};