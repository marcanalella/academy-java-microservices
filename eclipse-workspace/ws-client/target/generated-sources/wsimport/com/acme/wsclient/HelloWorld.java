
package com.acme.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://example.acme.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param x
     * @param y
     * @param z
     * @return
     *     returns com.acme.wsclient.Car
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello2", targetNamespace = "http://example.acme.com", className = "com.acme.wsclient.Hello2")
    @ResponseWrapper(localName = "hello2Response", targetNamespace = "http://example.acme.com", className = "com.acme.wsclient.Hello2Response")
    public Car hello2(
        @WebParam(name = "x", targetNamespace = "")
        String x,
        @WebParam(name = "y", targetNamespace = "")
        int y,
        @WebParam(name = "z", targetNamespace = "")
        double z);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://example.acme.com", className = "com.acme.wsclient.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://example.acme.com", className = "com.acme.wsclient.HelloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}