
int main() {
    int x = 4;
    int a, b;
  switch (x) 
  { 
    // 이 블록은 비어 있지 않고, break나 throw 문이 누락되어 있습니다(비준수).
    case 4: 
      a = b; 

    // default 블록은 항상 break 문을 가져야 합니다(비준수).
    default: 
    
  }

  return 0;
}