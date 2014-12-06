package helloservice.endpoint;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 * example from http://docs.oracle.com/javaee/6/tutorial/doc/bnayn.html
 * 
 * run and check : http://localhost:8080/wsdl-example/Hello?wsdl
 *
 */
@WebService
public class Hello {

	private String message = new String("Hello, ");

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}