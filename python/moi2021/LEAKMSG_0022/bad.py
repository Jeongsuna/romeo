import traceback
import requests as requests


def fetch_url(url, useragent, referer=None, retries=1, dimension=False):

    try:
        response = requests.get(url, stream=True, timeout=5, headers={
        'User-Agent': useragent,
        'Referer': referer,
        })

    except IOError:
        # 에러메시지를 통해 스택정보가 노출됨.
        traceback.print_exc()
