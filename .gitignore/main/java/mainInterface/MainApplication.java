
package mainInterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import controller.CamelControllerPort;
import controller.RestControllerPort;
@SpringBootApplication
@Configuration
@ImportResource(locations = {"classpath:/META-INF/application-context.xml"})
//@ComponentScan(basePackageClasses = RestControllerPort.class)

//@ComponentScan(basePackageClasses = CamelControllerPort.class)
public class MainApplication{

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
