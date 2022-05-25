
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication // Noncompliant; ANNODEFAULT_BAD is declared in the default package
@ComponentScan("")
@ServletComponentScan
public class ANNODEFAULT_BAD {
}
