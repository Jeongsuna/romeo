from django.contrib.auth.decorators import login_required, permission_required
from django.shortcuts import render
from .models import Content


def bad(request):
    action = request.POST.get('action', '')
    content_id = request.POST.get('content_id', '')
    if action is not None and action == "delete":
        Content.objects.filter(id=content_id).delete()
        return render(request, '/success.html')
    else:
        return render(request, '/error.html', {'error':'접근 권한이 없습니다.'})


@login_required  # 해당 기능을 수행할 권한이 있는지 확인
@permission_required('content.delete', raise_exception=True)
def good(request):
    action = request.POST.get('action', '')
    content_id = request.POST.get('content_id', '')

    if action is not None and action == "delete":
        Content.objects.filter(id=content_id).delete()
        return render(request, '/success.html')
    else:
        return render(request, '/error.html', {'error': '삭제 실패'})