## 소개
쿠퍼에서 검출하는 이슈를 예를들어, 답안지.csv에 저장하고
검출되어야하는 이슈 목록은 예를들어, 정답지.csv에 저장되어 있다고 할 때,
답안지.csv에 정답지.csv에 해당하는 이슈가 어느 정도 있는지 검사하는 도구
* intellij로 수정 가능

## 실행법
1st argument: 답안지.csv
2nd argument: 정답지.csv

## 답안지 포맷
* cooper의 보고서 파트에서 생성되는 CSV 형태를 따를 것(현재 murph fa8ae467 기준)
* B열 캐논코드_이름, G열 파일명, H열 라인
* 주의! csv에는 ", ' 등은 없다고 가정 

## 정답지 포맷
* cooper의 보고서 파트에서 생성되는 CSV 형태를 따를 것(현재 murph fa8ae467 기준)
* A열 캐논코드_이름, J열 파일명, L열 라인
* 예) ./solution/RomeoLightJava__murph_fa8ae467_romeo_1908765a.csv
* 주의! csv에는 ", ' 등은 없다고 가정