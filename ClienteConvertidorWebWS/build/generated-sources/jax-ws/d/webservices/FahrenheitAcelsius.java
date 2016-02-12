
package d.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FahrenheitAcelsius complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FahrenheitAcelsius">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fahrenheit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FahrenheitAcelsius", propOrder = {
    "fahrenheit"
})
public class FahrenheitAcelsius {

    protected double fahrenheit;

    /**
     * Obtiene el valor de la propiedad fahrenheit.
     * 
     */
    public double getFahrenheit() {
        return fahrenheit;
    }

    /**
     * Define el valor de la propiedad fahrenheit.
     * 
     */
    public void setFahrenheit(double value) {
        this.fahrenheit = value;
    }

}
