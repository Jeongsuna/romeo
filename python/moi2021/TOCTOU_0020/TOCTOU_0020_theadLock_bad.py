import io
import datetime
import os
import threading


def bad(filename, content):
    if os.path.isfile(filename) is True:
        f = open(filename, 'w')
        f.seek(0, io.SEEK_END)
        f.write(content)
        f.close()



def start_bad():
    filename = './temp.txt'
    content = 'start time is ' + datetime.datetime.now()
    my_thread = threading.Thread(target=bad, args=(filename, content))
    my_thread.start()

