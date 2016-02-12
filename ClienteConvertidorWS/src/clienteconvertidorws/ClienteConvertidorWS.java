/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteconvertidorws;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class ClienteConvertidorWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opc;
       String stropc = JOptionPane.showInputDialog("---Conversion de Temperatura---\n\nmenu:\n\n(1) Celsius a Fahrenheit "
               + "\n(2) Fahrenheit a Celsius \n(3) salir\n\nElija su opcion");
       opc=Integer.valueOf(stropc);
       
       switch(opc){
           case 1:
               double celsius;
               String strCelsius = JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius");
               celsius = Double.valueOf(strCelsius);
               double fahrenheit = celsisuAFahrenheit(celsius);
               JOptionPane.showMessageDialog(null, "Resultado es:" + fahrenheit + "fahrenheit");
               break;
           case 2:
               String strFahrenheit = JOptionPane.showInputDialog("Ingrese la temperatura en grados fahrenheit");
               fahrenheit = Double.valueOf(strFahrenheit);
                celsius = fahrenheitAcelsius(fahrenheit);
               JOptionPane.showMessageDialog(null, "Resultado es:" + celsius + "Celsius");
               break;    
           case 3:
               break;
               
           default:
               JOptionPane.showMessageDialog(null,"Opcion Incorrecta");
          
    }
       }
       
       

    private static double fahrenheitAcelsius(double fahrenheit) {
        d.webservices.ConversionTem_Service service = new d.webservices.ConversionTem_Service();
        d.webservices.ConversionTem port = service.getConversionTemPort();
        return port.fahrenheitAcelsius(fahrenheit);
    }

    private static double celsisuAFahrenheit(double celsius) {
        d.webservices.ConversionTem_Service service = new d.webservices.ConversionTem_Service();
        d.webservices.ConversionTem port = service.getConversionTemPort();
        return port.celsisuAFahrenheit(celsius);
    }
    
}
