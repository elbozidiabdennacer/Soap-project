/**
 * ControleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class ControleServiceLocator extends org.apache.axis.client.Service implements ws.ControleService {

    public ControleServiceLocator() {
    }


    public ControleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Controle
    private java.lang.String Controle_address = "http://localhost:8080/SOAP_Serv/services/Controle";

    public java.lang.String getControleAddress() {
        return Controle_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControleWSDDServiceName = "Controle";

    public java.lang.String getControleWSDDServiceName() {
        return ControleWSDDServiceName;
    }

    public void setControleWSDDServiceName(java.lang.String name) {
        ControleWSDDServiceName = name;
    }

    public ws.Controle getControle() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Controle_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControle(endpoint);
    }

    public ws.Controle getControle(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.ControleSoapBindingStub _stub = new ws.ControleSoapBindingStub(portAddress, this);
            _stub.setPortName(getControleWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControleEndpointAddress(java.lang.String address) {
        Controle_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.Controle.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.ControleSoapBindingStub _stub = new ws.ControleSoapBindingStub(new java.net.URL(Controle_address), this);
                _stub.setPortName(getControleWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Controle".equals(inputPortName)) {
            return getControle();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws", "ControleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws", "Controle"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Controle".equals(portName)) {
            setControleEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
