import os


def bad():
    os.chmod('/root/system_config', 0o777)
    with open("/root/system_config", 'w') as f:
        f.write("your config is broken")


def good():
    os.chmod('/root/system_config', 0o700)
    with open("/root/system_config", 'w') as f:
        f.write("your config is broken")
