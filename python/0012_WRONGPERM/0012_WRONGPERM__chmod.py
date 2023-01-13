import os


def bad(file_path):
    # FLAW:
    os.chmod(file_path, 0o777)


def good(file_path):
    # FIX:
    os.chmod(file_path, 0o444)
