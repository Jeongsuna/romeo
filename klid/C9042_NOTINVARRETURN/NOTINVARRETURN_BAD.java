package C9042_NOTINVARRETURN;

public class NOTINVARRETURN_BAD {
  
  int NOTINVARRETURN_BAD_FUNC(int n) {
    int x = 12;
    if (n == 1) {
      return x;
    }
    return x;  // Noncompliant
  }
  
}