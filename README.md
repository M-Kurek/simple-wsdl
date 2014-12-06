simple wsdl example
===========

#Intro

##Target

Add examples of ArquillianCucumber tests.

##Inspired by
Maven adaptation of [Oracle Web Service and Clients with JAX-WS]
(http://docs.oracle.com/javaee/6/tutorial/doc/bnayn.html) and popular Calculator SOAP example.

# Run

##prepare
- downlaod/clone 
- browse to project folder
- $ mvn clean jboss-as:run

##check
- open http://localhost:8080/simple-wsdls/Calculator?wsdl
- JBoss logs should contain:

```
 id=calculator.endpoint.Calculator
 address=http://localhost:8080/simple-wsdls/Calculator
```

_see : ./target/jboss-as-run/jboss-as-7.1.1.Final/..../server.log_
