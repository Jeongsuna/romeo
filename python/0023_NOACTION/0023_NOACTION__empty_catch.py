def bad():
    try:
        f = open('file')
        i = 0
        while i < 10:
            line = f.readline()
            print(line)
            i = i + 1
        f.close()
    except OSError:
        pass


def good():
    try:
        f = open('file')
        i = 0
        while i < 10:
            line = f.readline()
            print(line)
            i = i + 1
        f.close()
    except OSError:
        print('cannot open', 'file')
