import io
import datetime
import os
import threading

lock = threading.Lock()


def good(filename, content):
    with lock:
        if os.path.isfile(filename) is True:
            f = open(filename, 'w')
            f.seek(0, io.SEEK_END)
            f.write(content)
            f.close()


def start_good():
    filename = './temp.txt'
    content = 'start time is ' + datetime.datetime.now()
    my_thread = threading.Thread(target=good, args=(filename, content))
    my_thread.start()
