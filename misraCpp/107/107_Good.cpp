int main() {
  int x = 4;
  int a, b;

  switch (x) 
  { 
    // 이 블록은 break 문으로 끝나므로 준수입니다.
    case 0: 
      break;

    // 이 블록은 비어 있고, drop through를 허용합니다(준수).  
    case 1: 

    // 이 블록은 break 문으로 끝나므로 준수입니다.
    case 2: 
      break;
    
    // 이 블록은 throw 문으로 끝나므로 준수입니다.
    case 3: 
      throw;
    }
    return 0;
}