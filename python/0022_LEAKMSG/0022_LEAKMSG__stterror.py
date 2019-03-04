def bad():
    try:
        f = open('file')
        i = 0
        while i < 10:
            line = f.readline()
            print(line)
            i = i + 1
        f.close()
    except OSError as e:
        # FLAW:
        print('I/O error({0}): {1}'.format(e.error, e.strerror))


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
        # FIX:
        print('cannot open', 'file')
