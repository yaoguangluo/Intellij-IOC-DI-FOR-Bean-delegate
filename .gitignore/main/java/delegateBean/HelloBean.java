package delegateBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import restService.HelloService;

@Repository
@Qualifier("HelloBean")
public class HelloBean {
    @Autowired
   // @Qualifier("HelloService")
    private HelloService helloService;

    private String say = "123";
    private int hello=123;
    public String saySomething(){
        helloService.testSample(hello);

        return say;
    }

}