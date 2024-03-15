class C {
  public:
    static int x;

    C() try {
      // 예외를 발생시킬 수 있는 작업
    } catch (...) {
      if (0 == x) { // 준수 - x는 여기서 안전하게 접근 가능
        // x의 값에 따라 작업
      }
    }

    ~C() try {
      // 예외를 발생시킬 수 있는 작업
    } catch (...) {
      if (0 == x) { // 준수 - x는 여기서 안전하게 접근 가능
         // x의 값에 따라 작업
      }
    }
};

int main()
{
    return 0;
}