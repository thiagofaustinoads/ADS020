/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author thiag
 */
@WebService(serviceName = "CalculadoraWS")
public class CalculadoraWS {

  
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "somarInteiros")
    public int somar(@WebParam(name = "operadorA") int a, @WebParam(name = "operadorB") int b) {
        return a + b;
    }
    
    @WebMethod(operationName = "subtrairInteiros")
    public int subtrair(@WebParam(name = "operadorA") int a, @WebParam(name = "operadorB") int b) {
        return a - b;
    }
    
    @WebMethod(operationName = "multiplicarInteiros")
    public int multiplicar(@WebParam(name = "operadorA") int a, @WebParam(name = "operadorB") int b) {
        return a * b;
    }
    
    @WebMethod(operationName = "dividirInteiros")
    public int dividir(@WebParam(name = "operadorA") int a, @WebParam(name = "operadorB") int b) {
        return a / b;
    }
}