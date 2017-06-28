package controller;

//import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelControllerPort {


	    public void configure() throws Exception {
	    //	from("timer://hello?period=1000").bean("myBean").to("stream:out");
	    	//from("/aa").bean("myBean").to("stream:out"); 
	}
}