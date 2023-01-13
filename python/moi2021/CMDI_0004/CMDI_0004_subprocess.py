import subprocess
from django.shortcuts import render


def bad(request):
    date = request.POST.get('date','')
    cmd_str = "cmd /c backuplog.bat" + date
    subprocess.run(cmd_str, shell=True)
    return render(request, '/success.html')



def good(request):
    date = request.POST.get('date','')
    for word in ['|', ';', '&', ':', '>', '<', '`', '\\', '!']:
        date = date.replace(word, "")
    subprocess.run(["cmd", "/c", "backuplog.bat", date])
    return render(request, '/success.html')