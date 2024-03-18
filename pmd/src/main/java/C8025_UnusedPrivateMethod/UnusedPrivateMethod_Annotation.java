package C8025_UnusedPrivateMethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UnusedPrivateMethod_Annotation {
    @PostConstruct
    private void init() {}

    @Deprecated
    private void deprecated() {}

    @PreDestroy
    private void destroy() {}

    @Controller
    private void controller() {}

    @ResponseBody
    private void reponseBody() {}
}
