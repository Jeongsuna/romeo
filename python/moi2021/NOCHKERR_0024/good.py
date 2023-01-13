import sys

def get_content():
    try:
        f = open('myfile.txt')
        s = f.readline()
        i = int(s.strip())
    # 발생할 수 있는 오류의 종류와 순서에 맞춰서 예외 처리 한다.
    except FileNotFoundError:
        print("file is not found")
    except OSError:
        print("cannot open file")
    except ValueError:
        print("Could not convert data to an integer.")
        