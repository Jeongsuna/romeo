import sys

def get_config():
    lines = None
    try:
        f = open('config.cfg')
        lines = f.readlines()
    except Exception as e:
        print("error")
    finally:
        # try 절에서 할당한 자원은
        # finally절에서 시스템에 반환을 해 주어야 한다
        f.close()
        return lines

# with 절을 빠져나갈 때 f를 시스템에 반환
def good():
    with open("filename.py") as f:
        print(f.read())
