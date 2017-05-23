/**
 * ExposureServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureServiceLocator extends org.apache.axis.client.Service implements exposure.service.fhlbatl.com.ExposureService {

    public ExposureServiceLocator() {
    }


    public ExposureServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExposureServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExposureServicePort
    private java.lang.String ExposureServicePort_address = "http://localhost:7001/exp/exposure_svc/1_1";

    public java.lang.String getExposureServicePortAddress() {
        return ExposureServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExposureServicePortWSDDServiceName = "ExposureServicePort";

    public java.lang.String getExposureServicePortWSDDServiceName() {
        return ExposureServicePortWSDDServiceName;
    }

    public void setExposureServicePortWSDDServiceName(java.lang.String name) {
        ExposureServicePortWSDDServiceName = name;
    }

    public exposure.service.fhlbatl.com.ExposureServicePort getExposureServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExposureServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExposureServicePort(endpoint);
    }

    public exposure.service.fhlbatl.com.ExposureServicePort getExposureServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            exposure.service.fhlbatl.com.ExposureServicePortBindingStub _stub = new exposure.service.fhlbatl.com.ExposureServicePortBindingStub(portAddress, this);
            _stub.setPortName(getExposureServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExposureServicePortEndpointAddress(java.lang.String address) {
        ExposureServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (exposure.service.fhlbatl.com.ExposureServicePort.class.isAssignableFrom(serviceEndpointInterface)) {
                exposure.service.fhlbatl.com.ExposureServicePortBindingStub _stub = new exposure.service.fhlbatl.com.ExposureServicePortBindingStub(new java.net.URL(ExposureServicePort_address), this);
                _stub.setPortName(getExposureServicePortWSDDServiceName());
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
        if ("ExposureServicePort".equals(inputPortName)) {
            return getExposureServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "ExposureService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "ExposureServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExposureServicePort".equals(portName)) {
            setExposureServicePortEndpointAddress(address);
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
