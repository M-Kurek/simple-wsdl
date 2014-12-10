package calculator.endpoint;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public class Calculator {
	
    public double add(double a, double b) {
        return a + b;
    }
 
    public double subtract(double a, double b) {
        return a - b;
    }
}
