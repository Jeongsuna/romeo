import os


def bad(file_path):
    permissions = os.getenv("filePermissions")
    # FLAW:
    os.chmod(file_path, permissions)


def good(file_path):
    # FIX:
    os.chmod(file_path, 444)
