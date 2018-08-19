package farg.rest.wildfly.springwildfly;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {
	
	@RequestMapping("hello")
	public String sayHello() {
		return ("Hello, SpringBoot on Wildfly");
	}
	
	@RequestMapping("/hello1/{name}")
    String hello(@PathVariable String name) {
         
             return "Hi "+name+" !";
              
    }
}
