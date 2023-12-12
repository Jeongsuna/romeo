#include <iostream>
#include <stdint.h>
#include <stdexcept>
#include <fstream>
#include <stdio.h>
#include <sqlite3.h>
#include <thread>
using namespace std;


void writeToFileStream() {
  std::ofstream file;
  file.open("test.txt");
  if (file.is_open()) {
    file << "Hello, World!";
    file.close();
  }
}

void writeFile(){
  FILE* file = fopen("test.txt","w");
  fprintf(file,"test");
  fclose(file);
}

int16_t global; // Global variable
static int statcVar;

void pointless() // Function with external side effects
{ 
    global = 0; 
}

void changeArgument(int& arg) {
  arg = 10;
}

int main() {
  int x = 0;
  changeArgument(x);  // x의 값이 10으로 변경됨 ?
  return 0;
}

volatile int flag = 0;

void setFlag() {
  flag = 1;
}

void throwError() {
  throw std::runtime_error("An error occurred");
}

void doSomething() { //thread 예제를 위한 의미 없는 함수
  statcVar = 1;
}

void startThread() {
  thread t(doSomething);
  t.detach();
}