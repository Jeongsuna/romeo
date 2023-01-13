import sys

def get_config():
    lines = None
    try:
        f = open('config.cfg')
        lines = f.readlines()

        # try (close) 절에서 할당한 자원이 반환 되기 전에
        # 예외가 발생하면 할당된 자원이 시스템에 반환되지 않음
        f.close()
        return lines
    except Exception as e:
        return ''
