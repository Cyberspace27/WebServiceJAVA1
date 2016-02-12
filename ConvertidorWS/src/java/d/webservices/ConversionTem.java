/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ariel
 */
@WebService(serviceName = "ConversionTem")
public class ConversionTem {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CelsisuAFahrenheit")
    public double CelsisuAFahrenheit(@WebParam(name = "celsius") double celsius) {
        double fahrenheit;
        fahrenheit = (celsius*9/5)+32;
        return fahrenheit;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FahrenheitAcelsius")
    public double FahrenheitAcelsius(@WebParam(name = "fahrenheit") double fahrenheit) {
       double celsius;
       celsius = (fahrenheit-32)*5/9;
        return celsius;
    }
}
