# Romeo

## 이름규칙
* 폴더이름의 규칙
  - ``C<캐논식별코드>_<캐논고유이름>__CWE<CWE아이디>_<CWE타이틀>`` 
  - ``<CWE타이틀>``에서 공백은 ``_`` 로 대체하도록 한다.
  - 예) C00B0_HTMLCOMMENT__CWE830_Inclusion_of_Web_Functionality_from_an_Untrusted_Source
  - 예 설명) 캐논 식별코드: 00B0, 캐논고유이름: HTMLCOMMENT, CWE아이디: 830, CWE타이틀: Inclusion of Web Functionality from an Untrusted Source
* 파일이름의 규칙
  - ``C<캐논식별코드>_CWE<CWE아이디>_<CWE타이틀>__<unit>``
  - 캐논과 CWE 사이에 ``__``가 아니라 ``_``임에 주의
  - ``<CWE타이틀>``에서 공백은 ``_`` 로 대체하도록 한다.  
  - ``_CWE<CWE아이디>_<CWE타이틀>`` 는 생략가능
  - ``<unit>``은 해당 파일을 잘 나타낼 수 있는 이름, 번호, bad/good 여부를 포함
  - ``<unit>``에서 공백은 ``_`` 로 대체하도록 한다.
  - 예) C002C_CWE495_Private_Array_Typed_Field_Returned_From_A_Public_Method__basic_return_01_bad
  - 예 설명) 캐논 식별코드: 002C, CWE아이디: 495, CWE타이틀: Private Array Typed Field Returned From A Public Method, unit: basic_return_01_bad 
* 주의사항: 동일한 캐논을 위한 테스트 데이터 폴더가 2개인 경우, R/P 계산시 값이 일정하지 않을 수 있으므로 주의 
  - 예) CWE89의 캐논 코드는 0001. CWE89로 시작하는 폴더와 C0001로 시작하는 폴더가 존재

## PHP
* 참고: https://github.com/stivalet/PHP-Vulnerability-test-suite

## Objective-C
* 참고: https://vulncat.fortify.com/en
