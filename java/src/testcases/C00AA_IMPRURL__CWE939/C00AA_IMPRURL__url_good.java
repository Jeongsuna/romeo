package testcases.C00AA_IMPRURL__CWE939;

import android.webkit.WebView;

import java.util.ArrayList;

public class C00AA_IMPRURL__url_good extends WebViewClient{
    // 화이트리스트에 허용할 URL 추가
    ArrayList<String> allowedUrls = new ArrayList<>();
    allowedUrls.add("examplescheme:getUserInfo"); // 예시로 허용할 URL을 추가합니다

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.startsWith("examplescheme:")) {
            // 허용할 URL 목록에 있는지 확인
            if (allowedUrls.contains(url)) {
                writeDataToView(view, UserData);
                // 허용된 URL이므로 로딩을 계속합니다
                return false;
            }
            else {
                // 허용되지 않은 URL이면 차단
                return true;
            }
        }
        // examplescheme:로 시작하지 않는 URL은 허용
        return false;
    }

    }
