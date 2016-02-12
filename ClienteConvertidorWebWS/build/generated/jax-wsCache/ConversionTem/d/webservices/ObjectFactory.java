
package d.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the d.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FahrenheitAcelsiusResponse_QNAME = new QName("http://webservices.d/", "FahrenheitAcelsiusResponse");
    private final static QName _CelsisuAFahrenheit_QNAME = new QName("http://webservices.d/", "CelsisuAFahrenheit");
    private final static QName _CelsisuAFahrenheitResponse_QNAME = new QName("http://webservices.d/", "CelsisuAFahrenheitResponse");
    private final static QName _FahrenheitAcelsius_QNAME = new QName("http://webservices.d/", "FahrenheitAcelsius");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: d.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FahrenheitAcelsius }
     * 
     */
    public FahrenheitAcelsius createFahrenheitAcelsius() {
        return new FahrenheitAcelsius();
    }

    /**
     * Create an instance of {@link CelsisuAFahrenheitResponse }
     * 
     */
    public CelsisuAFahrenheitResponse createCelsisuAFahrenheitResponse() {
        return new CelsisuAFahrenheitResponse();
    }

    /**
     * Create an instance of {@link CelsisuAFahrenheit }
     * 
     */
    public CelsisuAFahrenheit createCelsisuAFahrenheit() {
        return new CelsisuAFahrenheit();
    }

    /**
     * Create an instance of {@link FahrenheitAcelsiusResponse }
     * 
     */
    public FahrenheitAcelsiusResponse createFahrenheitAcelsiusResponse() {
        return new FahrenheitAcelsiusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitAcelsiusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.d/", name = "FahrenheitAcelsiusResponse")
    public JAXBElement<FahrenheitAcelsiusResponse> createFahrenheitAcelsiusResponse(FahrenheitAcelsiusResponse value) {
        return new JAXBElement<FahrenheitAcelsiusResponse>(_FahrenheitAcelsiusResponse_QNAME, FahrenheitAcelsiusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsisuAFahrenheit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.d/", name = "CelsisuAFahrenheit")
    public JAXBElement<CelsisuAFahrenheit> createCelsisuAFahrenheit(CelsisuAFahrenheit value) {
        return new JAXBElement<CelsisuAFahrenheit>(_CelsisuAFahrenheit_QNAME, CelsisuAFahrenheit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsisuAFahrenheitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.d/", name = "CelsisuAFahrenheitResponse")
    public JAXBElement<CelsisuAFahrenheitResponse> createCelsisuAFahrenheitResponse(CelsisuAFahrenheitResponse value) {
        return new JAXBElement<CelsisuAFahrenheitResponse>(_CelsisuAFahrenheitResponse_QNAME, CelsisuAFahrenheitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitAcelsius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.d/", name = "FahrenheitAcelsius")
    public JAXBElement<FahrenheitAcelsius> createFahrenheitAcelsius(FahrenheitAcelsius value) {
        return new JAXBElement<FahrenheitAcelsius>(_FahrenheitAcelsius_QNAME, FahrenheitAcelsius.class, null, value);
    }

}
