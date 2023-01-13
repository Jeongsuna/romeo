import sys

def get_content():
    try:
        f = open('myfile.txt')
        s = f.readline()
        i = int(s.strip())
    #예외처리를 세분화 할 수 있음에도 광범위하게 사용하여 예기치 않은
    # 문제가 발생할 수 있다
    except:
        print("Unexpected error "     )
